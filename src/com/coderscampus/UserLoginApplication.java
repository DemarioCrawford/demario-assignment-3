package com.coderscampus;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class UserLoginApplication {

	public static void main(String[] args) {
		
		try {
			BufferedReader fileReader = new BufferedReader(new FileReader("dataa3.txt"));
			System.out.println(fileReader.toString());
			fileReader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		UserLoginService userService = new UserLoginService();
		UserLoginPojo[] users = new UserLoginPojo[3];
		
		for (int i = 0; i < 3; i++) {
			
			users[i] = userService.createUser("user" + (i+1), "password" + (i+1), "name" + (i+1));
		}
		System.out.println(users);
		
		Scanner scanner = new Scanner(System.in);
		String userEmailInput = collectInput(scanner, "Enter your email:");
		String userPasswordInput = collectInput (scanner, "Enter your password");
		
		
	}

	private static String collectInput(Scanner scanner, String messageToDisplay) {
		System.out.println(messageToDisplay);
		String userInput = scanner.nextLine();
		return userInput;
	}

}
