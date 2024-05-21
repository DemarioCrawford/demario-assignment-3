package com.coderscampus;

public class UserService {
// setter for parse
//array for the createUser to call 
	public static User createUser(String username, String password, String name) {
		User user = new User(username, password, name);
		user.setUsername(username);
		user.setPassword(password);
		user.setName(name);
		return user;
	}
		

	

}
