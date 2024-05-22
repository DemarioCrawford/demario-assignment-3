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
	// validate user's info
	public User validateUser(User[] users, String username, String password, String name) {
		for (User user: users) {
			if (user.getUsername().equalsIgnoreCase(username) && user.getPassword().equals(password)) {
				return user;
			}
		}
		return null;
	}
	public User validateUser(User[] users, String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

}
