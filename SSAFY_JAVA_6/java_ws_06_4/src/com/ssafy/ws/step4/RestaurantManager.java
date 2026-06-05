package com.ssafy.ws.step4;

import java.util.Arrays;

public class RestaurantManager {

	private final int MAX_RESTAURANT_SIZE = 100;
	private final int MAX_REVIEW_SIZE = 100;

	private Restaurant[] restaurants = new Restaurant[MAX_RESTAURANT_SIZE];
	private Review[] reviews = new Review[MAX_REVIEW_SIZE];

	private int restaurantSize = 0;
	private int reviewSize = 0;

	public KoreanRestaurant[] getKoreanRestaurantList() {
		int cnt = 0;
		for (int i = 0; i < restaurantSize; i++) {
			if (restaurants[i] instanceof KoreanRestaurant) {
				cnt++;
			}
		}
		if (cnt == 0)
			return null;

		KoreanRestaurant[] res = new KoreanRestaurant[cnt];
		for (int i = 0, idx = 0; i < restaurantSize; i++) {
			if (restaurants[i] instanceof KoreanRestaurant) {
				res[idx++] = (KoreanRestaurant) restaurants[i];
			}
		}
		return res;
	}

	public Restaurant[] getNonKoreanRestaurants() {
		int cnt = 0;
		for (int i = 0; i < restaurantSize; i++) {
			if (!(restaurants[i] instanceof KoreanRestaurant)) {
				cnt++;
			}
		}
		if (cnt == 0)
			return null;

		Restaurant[] res = new Restaurant[cnt];
		for (int i = 0, idx = 0; i < restaurantSize; i++) {
			if (!(restaurants[i] instanceof KoreanRestaurant)) {
				res[idx++] = restaurants[i];
			}
		}
		return res;
	}

	public void addRestaurant(Restaurant restaurant) {
		if (restaurantSize < MAX_RESTAURANT_SIZE) {
			restaurants[restaurantSize++] = restaurant;
		}
	}

	public void addReview(Review review) {
		if (reviewSize < MAX_REVIEW_SIZE) {
			reviews[reviewSize++] = review;
		}
	}

	public void removeRestaurant(int resId) {
		for (int i = 0; i < restaurantSize; i++) {
			if (restaurants[i].getResId() == resId) {
				for (int j = i; j < restaurantSize - 1; j++) {
					restaurants[j] = restaurants[j + 1];
				}
				restaurants[--restaurantSize] = null;
				break;
			}
		}
	}

	public void removeComment(int reviewId) {
		for (int i = 0; i < reviewSize; i++) {
			if (reviews[i].getReviewId() == reviewId) {
				for (int j = i; j < reviewSize - 1; j++) {
					reviews[j] = reviews[j + 1];
				}
				reviews[--reviewSize] = null;
				break;
			}
		}
	}

	public Restaurant[] getRestaurantList() {
		return Arrays.copyOfRange(restaurants, 0, restaurantSize);
	}

	public Review[] getReviewList() {
		return Arrays.copyOfRange(reviews, 0, reviewSize);
	}

	public Restaurant getRestaurant(int resId) {
		for (int i = 0; i < restaurantSize; i++) {
			if (restaurants[i].getResId() == resId)
				return restaurants[i];
		}
		return null;
	}

	public Review getReview(int reviewId) {
		for (int i = 0; i < reviewSize; i++) {
			if (reviews[i].getReviewId() == reviewId)
				return reviews[i];
		}
		return null;
	}
}