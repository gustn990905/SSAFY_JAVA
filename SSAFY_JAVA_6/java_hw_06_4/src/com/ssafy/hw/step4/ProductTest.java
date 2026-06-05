package com.ssafy.hw.step4;

public class ProductTest {

	public static void main(String[] args) {

		ProductManager manager = new ProductManager();

		// 상품 추가
		manager.addProduct(new Refrigerator("R01", "LG냉장고", 2000, 3, "LG", "대형 냉장고", "양문형", 800, true, 2024));

		manager.addProduct(new Refrigerator("R02", "삼성냉장고", 1800, 2, "Samsung", "일반 냉장고", "일반형", 600, false, 2023));

		manager.addProduct(new Product("P01", "전자레인지", 500, 5, "LG", "전자레인지"));

		Product[] products = manager.getProducts();

		System.out.println("********냉장고목록*********");
		for (Product p : products) {
			if (p instanceof Refrigerator) {
				System.out.println(p);
			}
		}

		System.out.println("******** 냉동고 있는 목록**********");
		for (Product p : products) {
			if (p instanceof Refrigerator) {
				Refrigerator r = (Refrigerator) p;
				if (r.isFreezer()) {
					System.out.println(r);
				}
			}
		}
		System.out.println("********* 이름 검색************");
		Product[] searchResult = manager.searchByName("LG");
		for (Product p : searchResult) {
			if (p != null) {
				System.out.println(p);
			}
		}

		System.out.println("**********재고 총 가격***********");
		int total = 0;
		for (Product p : products) {
			if (p != null) {
				total += p.getPrice() * p.getQuantity();
			}
		}
		System.out.println("총 재고 금액 : " + total);
	}
}