package com.ssafy.ws.step4;

/**
 * 맛집, 리뷰 객체의 리스트를 배열로 유지하며 관리하는 클래스
 */
public class RestaurantManager {
	private static final int MAX_RESTAURANT_SIZE = 100;
	private static final int MAX_REVIEW_SIZE = 1000;

	Restaurant[] restaurants = new Restaurant[MAX_RESTAURANT_SIZE];
	Review[] reviews = new Review[MAX_REVIEW_SIZE];
	private int restaurantSize = 0;
	private int reviewSize = 0;

	public boolean addRestaurant(Restaurant restaurant) {
		if (restaurantSize < MAX_RESTAURANT_SIZE) {
			restaurants[restaurantSize++] = restaurant;
			return true;
		} else {
			return false;
		}
	}

	public boolean addReview(Review review) {
		if (reviewSize < MAX_REVIEW_SIZE) {
			reviews[reviewSize++] = review;
			return true;
		} else {
			return false;
		}
	}

	public boolean updateRestaurant(Restaurant restaurant) {
		for (int i = 0; i < restaurantSize; i++) {
			if (restaurants[i].getResId() == (restaurant.getResId())) {
				restaurants[i] = restaurant;
				return true;
			}
		}
		return false;
	}

	public boolean removeRestaurant(int resId) {
		for (int i = 0; i < restaurantSize; i++) {
			if (restaurants[i].getResId() == resId) {
				for (int j = i; j < restaurantSize - 1; j++) {
					restaurants[j] = restaurants[j + 1];
				}

				restaurants[restaurantSize - 1] = null;
				restaurantSize--;
				return true;
			}
		}
		return false;
	}

	public boolean removeReview(int reviewId) {
		for (int i = 0; i < reviewSize; i++) {
			if (reviews[i].getResId() == reviewId) {
				for (int j = i; j < reviewSize - 1; j++) {
					reviews[j] = reviews[j + 1];
				}

				reviews[reviewSize - 1] = null;
				reviewSize--;
				return true;
			}
		}
		return false;
	}

	public Restaurant searchByResId(int resId) {
	    for (int i = 0; i < restaurantSize; i++) {
	        if (restaurants[i].getResId() == resId) {
	            return restaurants[i]; 
	        }
	    }
	    return null; 
	}
	
	public Review[] getRestaurantReview() {
		Review[] result = new Review[reviewSize];

		for (int i = 0; i < reviewSize; i++) {
			result[i] = reviews[i];
		}
		return result;
	}
	
	public Restaurant[] getRestaurant() {
		Restaurant[] result = new Restaurant[restaurantSize];

		for (int i = 0; i < restaurantSize; i++) {
			result[i] = restaurants[i];
		}
		return result;
	}
}
