package com.ssafy.ws.step5;

public class UserManager {
	private static final int MAX_USER_SIZE = 100;
	private User loginUser;
	private User[] users = new User[MAX_USER_SIZE];
	private int userSize = 0;

	public User getLoginUser() {
		return loginUser;
	}

	public void signup(User user) {
		if (userSize >= MAX_USER_SIZE) {
			return;
		}
		users[userSize++] = user;
	}

	public User login(String id, String password) {
		for (int i = 0; i < userSize; i++) {
			if (users[i].getUserId().equals(id) && users[i].getPassword().equals(password)) {
				loginUser = users[i];
				return loginUser;
			}
		}
		return null;
	}

	public void logout() {
		loginUser = null;
	}

	public User getUser(int userSeq) {
		if (userSeq < 0 || userSeq >= userSize) {
			return null;
		}
		return users[userSeq];
	}
}
