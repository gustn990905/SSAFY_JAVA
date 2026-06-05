package com.ssafy.ws.step4;

import java.util.Arrays;

public class RestaurantTest {

	public static void main(String[] args) {

		RestaurantManager manager = new RestaurantManager();

		manager.addRestaurant(new Restaurant(1, "BBQ", "서울", "치킨", 5));
		manager.addRestaurant(new KoreanRestaurant(2, "한식당", "부산", "비빔밥", 4, "051-111", "15:00~17:00"));

		manager.addReview(new Review(1, 1, "홍길동", "맛있어요"));
		manager.addReview(new Review(2, 2, "김싸피", "가성비 최고"));

		System.out.println("=== 전체 음식점 ===");
		System.out.println(Arrays.toString(manager.getRestaurantList()));

		System.out.println("=== 한식당 ===");
		System.out.println(Arrays.toString(manager.getKoreanRestaurantList()));

		System.out.println("=== 리뷰 ===");
		System.out.println(Arrays.toString(manager.getReviewList()));
	}
}