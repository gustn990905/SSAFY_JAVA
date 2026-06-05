package com.ssafy.ws.step3;

import java.util.Arrays;

/**
 * BookManager 클래스를 이용하여 도서 객체 추가,삭제,조회하는 클래스
 */
public class BookTest {

	public static void main(String[] args) {
		System.out.println("*************************도서목록*****************************");
		
		BookManager manager = new BookManager();
		Book book1 = new Book("21424", "Java Pro", "김하나", "jaen.kr", 15000, "Java 기본 문법");
		Book book2 = new Book("21425", "Java Pro2", "김하나", "jaen.kr", 25000, "Java 응용");
		Book book3 = new Book("35355", "분석 설계", "소나무", "jaen.kr", 30000, "SW 모델링");
		
		manager.add(book1);
		manager.add(book2);
		manager.add(book3);
		
		Book[] list = manager.getList();
		for(Book b : list) {
			System.out.println(b);
		}
		
		System.out.println("*************************도서조회:21424*****************************");
		
		Book[] searchBook = manager.searchByIsbn("21424");
		for(Book b : searchBook) {
			System.out.println(b);
		}
		
		manager.remove("21424");
		System.out.println("*************************도서삭제:21424*****************************");
		System.out.println("*************************도서목록*****************************");
		
		Book[] bookListFinal = manager.getList();
		for(Book b : bookListFinal) {
			System.out.println(b);
		}
	}
}
