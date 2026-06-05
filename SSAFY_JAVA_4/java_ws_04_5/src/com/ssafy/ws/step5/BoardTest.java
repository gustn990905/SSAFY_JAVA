package com.ssafy.ws.step5;

import java.util.Date;

public class BoardTest {
	public static void main(String[] args) {
		System.out.println("User 출력");
		System.out.println("-----------------------------------------");
		User user1 = new User(0, "ssafy", "1234", "김싸피", "김싸피", "ssafy@ssafy.com");
		User user2 = new User(1, "hong", "123", "홍싸피", "ssafy.hong", "hong@ssafy.com");
		User user3 = new User(2, "samsic", "samsic", "김삼식", "삼식이", "kim@ssafy.com");
		User user4 = new User(3, "happy", "happy", "이싸피", "해피바이러스", "lee@ssafy.com");
		System.out.println(user1);
		System.out.println(user2);
		System.out.println(user3);
		System.out.println(user4);

		System.out.println("게시글");
		System.out.println("-----------------------------------------");
		Article article1 = new Article(0, "공지사항", "게시글 내용", 0, 0, new Date());
		Article article2 = new Article(1, "코딩테스트란", "게시글 내용", 1, 0, new Date());
		Article article3 = new Article(2, "취뽀는 나에게", "게시글 내용", 2, 0, new Date());
		Article article4 = new Article(3, "Java 완전정복", "게시글 내용", 3, 0, new Date());
		System.out.println(article1);
		System.out.println(article2);
		System.out.println(article3);
		System.out.println(article4);

		System.out.println("게시글 댓글 출력");
		System.out.println("-----------------------------------------");
		Comment comment1 = new Comment(0, 1, 5, "잘 보았습니다.", new Date());
		Comment comment2 = new Comment(1, 1, 4, "좋은 글 입니다~~", new Date());
		System.out.println(comment1);
		System.out.println(comment2);
	}
}
