package com.ssafy.hw.step4;

public class ProductTest {
	public static void main(String[] args) {
		ProductManager pm = new ProductManager();

		Product p1 = new Product("P001", "노트북", 1500000, 1, "A", "a");
		Product p2 = new Product("P002", "마우스", 30000, 2, "B", "b");
		Product p3 = new Product("P003", "키보드", 80000, 3, "C", "c");

		pm.addProduct(p1);
		pm.addProduct(p2);
		pm.addProduct(p3);

		System.out.println("=== 전체 상품 목록 ===");
		for (Product p : pm.getProductList()) {
			System.out.println(p);
		}

		System.out.println("\n=== 상품 검색 (P002) ===");
		Product search = pm.searchByCode("P002");
		System.out.println(search);

		Product updated = new Product("P002", "무선 마우스", 50000, 2, "B", "b");
		pm.updateProduct(updated);

		System.out.println("\n=== 수정 후 상품 목록 ===");
		for (Product p : pm.getProductList()) {
			System.out.println(p);
		}

		System.out.println("\n=== 상품 판매 (P001) ===");
		int sellCnt = pm.sell("P001", 0);
		System.out.println("판매 결과 cnt = " + sellCnt);

		System.out.println("\n=== 판매 후 상품 목록 ===");
		for (Product p : pm.getProductList()) {
			System.out.println(p);
		}

		System.out.println("\n=== 상품 삭제 (P003) ===");
		pm.removeProduct("P003");

		System.out.println("\n=== 삭제 후 상품 목록 ===");
		for (Product p : pm.getProductList()) {
			System.out.println(p);
		}

		Review r1 = new Review(1, "P002", "작성자1", "가성비 좋아요");
		Review r2 = new Review(2, "P002", "작성자2", "배송이 빨라요");

		pm.addReview(r1);
		pm.addReview(r2);

		System.out.println("\n=== 리뷰 목록 ===");
		for (Review r : pm.getProductReview("P002")) {
			System.out.println(r);
		}

		System.out.println("\n=== 리뷰 삭제 (ID=1) ===");
		pm.removeReview(1);

		System.out.println("\n=== 리뷰 삭제 후 목록 ===");
		for (Review r : pm.getProductReview("P002")) {
			System.out.println(r);
		}
	}
}
