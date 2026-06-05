package com.ssafy.ws.step4;

/**
 * 맛집 객체를 생성하고 정보를 출력하는 클래스
 */
public class RestaurantTest {
	public static void main(String[] args) {
		RestaurantManager manager = new RestaurantManager();

		Restaurant r1 = new Restaurant(1, "을밀대", "서울 강남구", "02-111-1111", 1);
		Restaurant r2 = new Restaurant(2, "북촌손만두", "서울 종로구", "02-222-2222", 2);
		Restaurant r3 = new Restaurant(3, "광장시장빈대떡", "서울 종로구", "02-333-3333", 3);

		manager.addRestaurant(r1);
		manager.addRestaurant(r2);
		manager.addRestaurant(r3);

		System.out.println("=== 맛집 전체 ===");
		for (Restaurant r : manager.getRestaurant()) {
			System.out.println(r);
		}

		System.out.println("\n=== ID 2 검색 ===");
		Restaurant search = manager.searchByResId(2);
		if (search != null) {
			System.out.println(search);
		} else {
			System.out.println("검색 결과 없음");
		}

		System.out.println("\n=== ID 2 수정 ===");
		Restaurant updated = new Restaurant(2, "북촌손만두 리뉴얼", "서울 종로구", "02-222-3333", 5);
		boolean updateResult = manager.updateRestaurant(updated);
		System.out.println(updateResult);
		System.out.println(manager.searchByResId(2));

		System.out.println("\n=== ID 1 삭제 ===");
		boolean removeResult = manager.removeRestaurant(1);
		System.out.println(removeResult);

		System.out.println("\n=== 삭제 후 전체 맛집 ===");
		for (Restaurant r : manager.getRestaurant()) {
			System.out.println(r);
		}

		Review rev1 = new Review(1, 1,"작성자1", "맛있어요");
		Review rev2 = new Review(2, 2,"작성자2", "그냥 그래요");
		Review rev3 = new Review(3, 3,"작성자3", "별로임");

		manager.addReview(rev1);
		manager.addReview(rev2);
		manager.addReview(rev3);

		System.out.println("\n=== 리뷰 전체 ===");
		for (Review rev : manager.getRestaurantReview()) {
			System.out.println(rev);
		}

		System.out.println("\n=== ID 2 리뷰 삭제 ===");
		boolean reviewRemove = manager.removeReview(2);
		System.out.println(reviewRemove);

		System.out.println("\n=== 삭제 후 리뷰 전체 ===");
		for (Review rev : manager.getRestaurantReview()) {
			System.out.println(rev);
		}
	}
}