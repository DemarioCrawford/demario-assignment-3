package com.coderscampus;

public class UserLoginService {
	
	public Students createUser (String username, String password, String name) {
		Students user = new Students(name, password, username);
		user.setName(name);
		user.setPassword(password);
		user.setUsername(username);
		return user;
	}
}
