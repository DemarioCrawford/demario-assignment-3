package com.coderscampus;

public class UserLoginService {
	
	public UserLoginPojo createUser (String username, String password, String name) {
		UserLoginPojo user = new UserLoginPojo();
		user.setName(name);
		user.setPassword(password);
		user.setUsername(username);
		return user;
	}
}
