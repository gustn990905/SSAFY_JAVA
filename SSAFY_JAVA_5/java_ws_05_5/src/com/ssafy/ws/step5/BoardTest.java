package com.ssafy.ws.step5;

import java.util.Date;
import java.util.Scanner;

public class BoardTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        UserManager userManager = new UserManager();
        ArticleManager articleManager = new ArticleManager();
        CommentManager commentManager = new CommentManager();

        while (true) {

            System.out.println("===== 게시판 =====");
            System.out.println("1. 회원가입");
            System.out.println("2. 로그인");
            System.out.println("3. 로그아웃");
            System.out.println("4. 게시글 작성");
            System.out.println("5. 게시글 목록");
            System.out.println("6. 게시글 삭제");
            System.out.println("7. 댓글 작성");
            System.out.println("8. 댓글 조회");
            System.out.println("0. 종료");
            System.out.print("선택: ");

            int menu = sc.nextInt();
            sc.nextLine();

            if (menu == 0) break;

            switch (menu) {

                case 1:
                    System.out.print("회원번호: ");
                    int userSeq = sc.nextInt();
                    sc.nextLine();
                    System.out.print("아이디: ");
                    String userId = sc.nextLine();
                    System.out.print("비밀번호: ");
                    String password = sc.nextLine();
                    System.out.print("이름: ");
                    String userName = sc.nextLine();
                    System.out.print("닉네임: ");
                    String nickName = sc.nextLine();
                    System.out.print("이메일: ");
                    String email = sc.nextLine();

                    User user = new User(userSeq, userId, password, userName, nickName, email);
                    userManager.signup(user);
                    System.out.println("회원가입 완료");
                    break;

                case 2:
                    System.out.print("아이디: ");
                    userId = sc.nextLine();
                    System.out.print("비밀번호: ");
                    password = sc.nextLine();

                    User loginUser = userManager.login(userId, password);
                    if (loginUser != null) {
                        System.out.println("로그인 성공");
                    } else {
                        System.out.println("로그인 실패");
                    }
                    break;

                case 3:
                    userManager.logout();
                    System.out.println("로그아웃 완료");
                    break;

                case 4:
                    if (userManager.getLoginUser() == null) {
                        System.out.println("로그인 후 이용 가능합니다.");
                        break;
                    }

                    System.out.print("게시글 번호: ");
                    int articleId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("제목: ");
                    String title = sc.nextLine();
                    System.out.print("내용: ");
                    String content = sc.nextLine();

                    Article article = new Article(
                            articleId,
                            title,
                            content,
                            userManager.getLoginUser().getUserSeq(),
                            0,
                            new Date()
                    );

                    articleManager.addArticle(article);
                    System.out.println("게시글 작성 완료");
                    break;

                case 5:
                    Article[] articles = articleManager.getArticleList();
                    for (Article a : articles) {
                        System.out.println(a);
                    }
                    break;

                case 6:
                    System.out.print("삭제할 게시글 번호: ");
                    articleId = sc.nextInt();
                    sc.nextLine();

                    articleManager.removeArticle(articleId);
                    commentManager.removeArticle(articleId);
                    System.out.println("삭제 완료");
                    break;

                case 7:
                    if (userManager.getLoginUser() == null) {
                        System.out.println("로그인 후 이용 가능합니다.");
                        break;
                    }

                    System.out.print("게시글 번호: ");
                    articleId = sc.nextInt();
                    System.out.print("댓글 번호: ");
                    int commentId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("댓글 내용: ");
                    String cContent = sc.nextLine();

                    Comment comment = new Comment(
                            commentId,
                            articleId,
                            userManager.getLoginUser().getUserSeq(),
                            cContent,
                            new Date()
                    );

                    commentManager.addComment(comment);
                    System.out.println("댓글 작성 완료");
                    break;

                case 8:
                    System.out.print("게시글 번호: ");
                    articleId = sc.nextInt();
                    sc.nextLine();

                    Comment[] comments = commentManager.getCommentList(articleId);
                    for (Comment c : comments) {
                        System.out.println(c);
                    }
                    break;

                default:
                    System.out.println("잘못된 입력입니다.");
            }
        }

        sc.close();
    }
}
