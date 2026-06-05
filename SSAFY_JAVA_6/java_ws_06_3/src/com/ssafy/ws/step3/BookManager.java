package com.ssafy.ws.step3;

public class BookManager {

	private static final int MAX_SIZE = 100;
	private Book[] books = new Book[MAX_SIZE];
	private int size = 0;

	public void add(Book book) {
		if (size < MAX_SIZE) {
			books[size++] = book;
		}
	}

	public void remove(String isbn) {
		for (int i = 0; i < size; i++) {
			if (books[i].getIsbn().equals(isbn)) {
				for (int j = i; j < size - 1; j++) {
					books[j] = books[j + 1];
				}
				books[--size] = null;
				break;
			}
		}
	}

	public Book[] getList() {
		Book[] result = new Book[size];
		System.arraycopy(books, 0, result, 0, size);
		return result;
	}

	public Book searchByIsbn(String isbn) {
		for (int i = 0; i < size; i++) {
			if (books[i].getIsbn().equals(isbn)) {
				return books[i];
			}
		}
		return null;
	}

	public Book[] searchByTitle(String title) {
		Book[] temp = new Book[size];
		int count = 0;

		for (int i = 0; i < size; i++) {
			if (books[i].getTitle().contains(title)) {
				temp[count++] = books[i];
			}
		}

		Book[] result = new Book[count];
		System.arraycopy(temp, 0, result, 0, count);
		return result;
	}

	public Magazine[] getMagazines() {
		Magazine[] temp = new Magazine[size];
		int count = 0;

		for (int i = 0; i < size; i++) {
			if (books[i] instanceof Magazine) {
				temp[count++] = (Magazine) books[i];
			}
		}

		Magazine[] result = new Magazine[count];
		System.arraycopy(temp, 0, result, 0, count);
		return result;
	}

	public Book[] getBooks() {
		Book[] temp = new Book[size];
		int count = 0;

		for (int i = 0; i < size; i++) {
			if (!(books[i] instanceof Magazine)) {
				temp[count++] = books[i];
			}
		}

		Book[] result = new Book[count];
		System.arraycopy(temp, 0, result, 0, count);
		return result;
	}

	public int getTotalPrice() {
		int sum = 0;
		for (int i = 0; i < size; i++) {
			sum += books[i].getPrice();
		}
		return sum;
	}

	public double getPriceAvg() {
		if (size == 0)
			return 0;
		return (double) getTotalPrice() / size;
	}
}