package com.ssafy.ws.step5;

import java.util.Scanner;

public class BoardTest {

	static UserManager userManager = new UserManager();
	static ArticleManager articleManager = new ArticleManager();
	static CommentManager commentManager = new CommentManager();

	static int userSeqGen = 1;
	static int articleSeqGen = 1;
	static int commentSeqGen = 1;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("\n===== 게시판 메뉴 =====");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 로그아웃");
			System.out.println("4. 게시글 작성");
			System.out.println("5. 전체 게시글 보기");
			System.out.println("6. 게시글 상세보기");
			System.out.println("7. 게시글 검색");
			System.out.println("8. 일반 게시글 보기");
			System.out.println("9. 이미지 게시글 보기");
			System.out.println("0. 종료");

			int menu = sc.nextInt();
			sc.nextLine();

			if (menu == 0) {
				System.out.println("프로그램 종료");
				break;
			}

			switch (menu) {

			case 1: // 회원가입
				System.out.print("아이디: ");
				String id = sc.nextLine();
				System.out.print("비밀번호: ");
				String pw = sc.nextLine();

				User user = new User(userSeqGen++, id, pw, "이름", "닉네임", "email");
				userManager.signup(user);
				break;

			case 2: // 로그인
				System.out.print("아이디: ");
				String loginId = sc.nextLine();
				System.out.print("비밀번호: ");
				String loginPw = sc.nextLine();
				userManager.login(loginId, loginPw);
				break;

			case 3: // 로그아웃
				userManager.logout();
				break;

			case 4: // 게시글 작성
				if (userManager.getLoginUser() == null) {
					System.out.println("로그인 후 이용하세요.");
					break;
				}

				System.out.println("1. 일반글  2. 이미지글");
				int type = sc.nextInt();
				sc.nextLine();

				System.out.print("제목: ");
				String title = sc.nextLine();
				System.out.print("내용: ");
				String content = sc.nextLine();

				if (type == 1) {
					Article article = new Article(articleSeqGen++, title, content,
							userManager.getLoginUser().getUserSeq());
					articleManager.addArticle(article);
				} else {
					ImageArticle imgArticle = new ImageArticle(articleSeqGen++, title, content,
							userManager.getLoginUser().getUserSeq(), "image.jpg", 800, 600);
					articleManager.addArticle(imgArticle);
				}
				break;

			case 5: // 전체 게시글 보기
				Article[] all = articleManager.getAllArticles();
				for (int i = 0; i < articleManager.getSize(); i++) {
					System.out.println(all[i]);
				}
				break;

			case 6: // 상세보기
				System.out.print("게시글 번호 입력: ");
				int articleId = sc.nextInt();
				sc.nextLine();

				Article found = articleManager.getArticleById(articleId);

				if (found == null) {
					System.out.println("게시글이 존재하지 않습니다.");
					break;
				}

				found.increaseView();
				System.out.println("제목: " + found.getTitle());
				System.out.println("내용: " + found.getContent());

				System.out.println("\n--- 댓글 목록 ---");
				commentManager.printComments(articleId);

				System.out.println("1. 댓글 작성  0. 돌아가기");
				int cMenu = sc.nextInt();
				sc.nextLine();

				if (cMenu == 1) {
					if (userManager.getLoginUser() == null) {
						System.out.println("로그인 후 작성 가능합니다.");
						break;
					}

					System.out.print("댓글 내용: ");
					String cContent = sc.nextLine();

					Comment comment = new Comment(commentSeqGen++, articleId, userManager.getLoginUser().getUserSeq(),
							cContent);

					commentManager.addComment(comment);
				}
				break;

			case 7: // 검색
				System.out.print("검색어: ");
				String keyword = sc.nextLine();

				Article[] result = articleManager.searchByTitle(keyword);

				for (Article a : result) {
					if (a != null) {
						System.out.println(a);
					}
				}
				break;

			case 8: // 일반글 보기
				articleManager.printNormalArticles();
				break;

			case 9: // 이미지글 보기
				articleManager.printImageArticles();
				break;
			}
		}
		sc.close();
	}
}