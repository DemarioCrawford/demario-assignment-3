package com.coderscampus;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class UserLoginApplication {

	private static com.coderscampus.UserLoginService UserLoginService;

	public static void main(String[] args) throws IOException {
//Read the file and test it with a syso 

		FileService fileService = new FileService();
		Users[] users = fileService.readDataFromFile("dataa3.txt");
		 for (Users user : users) {
			 System.out.println(user);
		 }

		com.coderscampus.UserLoginService users1 = UserLoginService = new UserLoginService();
//		Scanner scanner = new Scanner(System.in);
//
//		int attempts = 0;
//		final int MAX_ATTEMPTS = 5;
//
//		while (attempts < MAX_ATTEMPTS) {
//			System.out.println("Enter your email");
//			String emailInput = scanner.nextLine();
//			System.out.println("Enter your password");
//			String passwordInput = scanner.nextLine();
//			// make variable a string
//			// break it into an array
//			// create user object
//			// put into an array of user objects
//
//			if (UserLoginService.authenticate(emailInput, passwordInput)) {
//				System.out.println("Welcome: " + getNameFromEmail(emailInput));
//				return;
//			} else {
//				System.out.println("Invalid login, please try again");
//				attempts++;
//			}
//		}
//
//		System.out.println("Too many failed login attempts, you are now locked out.");

	}

	private static String getNameFromEmail(String emailInput) {
		return emailInput;
	}

}
