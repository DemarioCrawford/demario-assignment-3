package com.coderscampus;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class UserApplication {

	public static void main(String[] args) throws IOException {

		FileService fileService = new FileService();
		Scanner scanner = new Scanner(System.in);
		UserService userService = new UserService();
		User[] users = fileService.readDataFromFile("dataa3.txt");

		int attempts = 0;
		final int Max_Attempts = 5;
		boolean loggedIn = false;

		while (attempts < Max_Attempts & !loggedIn) {
			System.out.println("Enter your email: ");
			String username = scanner.nextLine();
			System.out.println("Enter your password");
			String password = scanner.nextLine();

			User user = userService.validateUser(users, username, password);
			if (user != null) {
				System.out.println("Welcome " + user.getName());
				loggedIn = true;
			} else {
				System.out.println("Invalid login, please try again");
				attempts++;
			}

		}
		if (!loggedIn) {
			System.out.println("Too many failed login attempts, you are now locked out");
		}

	}

}
