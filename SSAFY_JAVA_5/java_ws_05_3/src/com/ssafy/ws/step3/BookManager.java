package com.ssafy.ws.step3;

/**
 * 도서리스트를 배열로 유지하며 관리하는 클래스
 */
public class BookManager {
	private static final int MAX_SIZE = 100;
	private Book[] books = new Book[MAX_SIZE];
	private int size = 0;
	
	public void add(Book book) {
		if(size < MAX_SIZE) {
			books[size] = book;
			size++;
		}
	}
	
	public void remove(String isbn) {
		for(int i=0; i<size; i++) {
			if(books[i].getIsbn().equals(isbn)) {
				for(int j = i; j<size-1; j++) {
					books[j] = books[j+1];
				}
				
				books[size-1] = null;
				size--;
				break;
			}
		}
	}
	
	public Book[] getList() {
		Book[] result = new Book[size];
		
		for(int i=0; i<size; i++) {
			result[i] = books[i];
		}
		return result;
	}
	
	public Book[] searchByIsbn(String isbn) {
		int cnt = 0;
		
		for(int i=0; i<size; i++) {
			if(books[i].getIsbn().equals(isbn)) {
				cnt++;
			}
		}
		
		Book[] result = new Book[cnt];
		int idx = 0;
		
		for(int j=0; j<size; j++) {
			if(books[j].getIsbn().equals(isbn)) {
				result[idx++] = books[j];
			}
		}

		return result;
		
	}
	
}
