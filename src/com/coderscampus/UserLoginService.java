package com.coderscampus;

public class UserLoginService {

	public Students createUser(String email, String password, String name) {
		Students user = new Students(email, password, name);
		user.setEmail(email);
		user.setPassword(password);
		user.setName(name);
		return user;
	}
}
