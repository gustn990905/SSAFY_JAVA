package com.ssafy.ws.step5;

public class UserManager {

	private static final int MAX = 100;
	private User[] users = new User[MAX];
	private int size = 0;
	private User loginUser;

	public void signup(User user) {
		users[size++] = user;
	}

	public User login(String id, String pw) {
		for (int i = 0; i < size; i++) {
			if (users[i].getUserId().equals(id) && users[i].getPassword().equals(pw)) {
				loginUser = users[i];
				return loginUser;
			}
		}
		return null;
	}

	public void logout() {
		loginUser = null;
	}

	public User getLoginUser() {
		return loginUser;
	}
}