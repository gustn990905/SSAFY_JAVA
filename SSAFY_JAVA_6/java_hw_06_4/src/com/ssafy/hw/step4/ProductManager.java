package com.ssafy.hw.step4;

public class ProductManager {

	private static final int MAX_PRODUCT_SIZE = 100;
	private static final int MAX_REVIEW_SIZE = 100;

	private Product[] products = new Product[MAX_PRODUCT_SIZE];
	private Review[] reviews = new Review[MAX_REVIEW_SIZE];

	private int pCount = 0;
	private int rCount = 0;

	public boolean addProduct(Product product) {
		if (pCount >= MAX_PRODUCT_SIZE)
			return false;
		products[pCount++] = product;
		return true;
	}

	public boolean updateProduct(Product product) {
		for (int i = 0; i < pCount; i++) {
			if (products[i].getpCode().equals(product.getpCode())) {
				products[i] = product;
				return true;
			}
		}
		return false;
	}

	public boolean removeProduct(String pCode) {
		for (int i = 0; i < pCount; i++) {
			if (products[i].getpCode().equals(pCode)) {
				products[i] = products[pCount - 1];
				products[pCount - 1] = null;
				pCount--;
				return true;
			}
		}
		return false;
	}

	public Product searchByCode(String pCode) {
		for (int i = 0; i < pCount; i++) {
			if (products[i].getpCode().equals(pCode)) {
				return products[i];
			}
		}
		return null;
	}

	public Product[] getProducts() {
		return products;
	}

	public Product[] searchByName(String name) {
		Product[] result = new Product[pCount];
		int idx = 0;

		for (int i = 0; i < pCount; i++) {
			if (products[i].getpName().contains(name)) {
				result[idx++] = products[i];
			}
		}
		return result;
	}

	public boolean addReview(Review review) {
		if (rCount >= MAX_REVIEW_SIZE)
			return false;
		reviews[rCount++] = review;
		return true;
	}

	public boolean removeReview(int reviewId) {
		for (int i = 0; i < rCount; i++) {
			if (reviews[i].getReviewId() == reviewId) {
				reviews[i] = reviews[rCount - 1];
				reviews[rCount - 1] = null;
				rCount--;
				return true;
			}
		}
		return false;
	}

	public Review[] getReviewByProduct(String pCode) {
		Review[] result = new Review[rCount];
		int idx = 0;

		for (int i = 0; i < rCount; i++) {
			if (reviews[i].getpCode().equals(pCode)) {
				result[idx++] = reviews[i];
			}
		}
		return result;
	}
}