package com.coderscampus;

public class UserLoginService {
// setter for parse
//array for the createUser to call 
	public Users[] createUser(String email, String password) {
		return users;
		
	}
//		Students user = new Students(email, password, name);
//		user.setEmail(email);
//		user.setPassword(password);
//		user.setName(name);
//		return user;
	private Users[] users;

	public Object UserService(Users[] users) {

		this.users = users;
		return users;
	}

	public boolean authenticate(String userEmailInput, String userPasswordInput) {
		for (Users user : users) {
			if (user.getEmail().equalsIgnoreCase(userEmailInput)
					&& user.getPassword().equalsIgnoreCase(userPasswordInput)) {
				return true;

			}
		}
		return false;
	}
}
