package com.coderscampus;

public class Users {
	// give students properties
	private String email;
	private String password;
	private String name;

	public Users(String email, String password, String name) {
		// call the properties using this.
		this.email = email;
		this.password = password;
		this.name = name;
	}

	// getters and setters
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

// overriding the to string
	@Override
	public String toString() {
		return "Users [email=" + email + ", password=" + password + ", name=" + name + "]";
	}

}
