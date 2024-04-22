package com.coderscampus;

public class UserLoginPojo {
	String username;
	String password;
	String name;
	String unsuccessfulLoginAttempts;
	
	public String getUnsuccessfulLoginAttempts() {
		return unsuccessfulLoginAttempts;
	}

	public void setUnsuccessfulLoginAttempts(String unsuccessfulLoginAttempts) {
		this.unsuccessfulLoginAttempts = unsuccessfulLoginAttempts;
	}

	public String getUsername () {
		return username;
	}
	
	public void setUsername (String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
