package com.ssafy.hw.step4;

import java.util.Arrays;

public class ProductManager {
	private static final int MAX_PRODUCT_SIZE = 100;
	private static final int MAX_REVIEW_SIZE = 1000;

	Product[] products = new Product[MAX_PRODUCT_SIZE];
	Review[] reviews = new Review[MAX_REVIEW_SIZE];

	private int pCount = 0;
	private int rCount = 0;

	public boolean addProduct(Product product) {
		if (pCount < MAX_PRODUCT_SIZE) {
			products[pCount++] = product;
			return true;
		}
		return false;
	}

	public boolean updateProduct(Product product) {
		for (int i = 0; i < pCount; i++) {
			if (products[i].equals(product)) {
				products[i] = product;
				return true;
			}
		}
		return false;
	}

	public boolean removeProduct(String pCode) {
		for (int i = 0; i < pCount; i++) {
			if (products[i].getpCode() == pCode) {
				for (int j = i; j < pCount - 1; j++) {
					products[j] = products[j + 1];
				}

				products[pCount - 1] = null;
				pCount--;
				return true;
			}
		}
		return false;
	}

	public int sell(String pCode, int cnt) {
		for (int i = 0; i < pCount; i++) {
			if (products[i].getpCode() == pCode) {
				cnt++;
				for (int j = i; j < pCount - 1; j++) {
					products[j] = products[j + 1];
				}

				products[pCount - 1] = null;
				pCount--;
				return cnt;
			}
		}
		return 0;
	}

	public Product[] getProductList() {
		Product[] result = new Product[pCount];

		for (int i = 0; i < pCount; i++) {
			result[i] = products[i];
		}
		return result;
	}

	public Product searchByCode(String pCode) {
		for (int i = 0; i < pCount; i++) {
			if (products[i].getpCode() == pCode) {
				return products[i];
			}
		}
		return null;
	}

	public boolean addReview(Review review) {
		if (rCount < MAX_REVIEW_SIZE) {
			reviews[rCount++] = review;
			return true;
		}
		return false;
	}

	public boolean removeReview(int reviewId) {
		for (int i = 0; i < rCount; i++) {
			if (reviews[i].getReviewId() == reviewId) {
				for (int j = i; j < rCount - 1; j++) {
					reviews[j] = reviews[j + 1];
				}
				reviews[rCount - 1] = null;
				rCount--;
				return true;
			}
		}
		return false;
	}

	public Review[] getProductReview(String pCode) {
		Review[] result = new Review[rCount];

		for (int i = 0; i < rCount; i++) {
			result[i] = reviews[i];
		}
		return result;
	}
}
