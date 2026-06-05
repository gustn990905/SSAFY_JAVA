package com.ssafy.ws.step3;

public class BookTest {

	public static void main(String[] args) {

		BookManager manager = new BookManager();

		manager.add(new Book("1111", "Java 기본", "홍길동", "멀티캠퍼스", 20000, "자바 기본서"));

		manager.add(new Magazine("2222", "Java 월간지", "이몽룡", "멀티캠퍼스", 15000, "자바 최신 기술", 2025, 3));

		manager.add(new Book("3333", "알고리즘", "김철수", "싸피출판", 30000, "알고리즘 문제집"));

		System.out.println("=== 전체 목록 ===");
		for (Book b : manager.getList()) {
			System.out.println(b);
		}

		System.out.println("\n=== 도서 목록 ===");
		for (Book b : manager.getBooks()) {
			System.out.println(b);
		}

		System.out.println("\n=== 잡지 목록 ===");
		for (Magazine m : manager.getMagazines()) {
			System.out.println(m);
		}

		System.out.println("\n총 가격: " + manager.getTotalPrice());
		System.out.println("평균 가격: " + manager.getPriceAvg());
	}
}