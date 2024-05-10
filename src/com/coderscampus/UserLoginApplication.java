package com.coderscampus;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class UserLoginApplication {

	public static void main(String[] args) throws IOException {
		BufferedReader fileReader = null;

		try {
			fileReader = new BufferedReader(new FileReader("dataa3.txt"));
			System.out.println(fileReader.readLine());

			Scanner scanner = new Scanner(System.in);
			int loginAttempts = 5;
			while (loginAttempts > 0) {
				System.out.println("Enter your email: ");
				String userEmailInput = scanner.nextLine();
				System.out.println("Enter your password: ");
				String userPasswordInput = scanner.nextLine();

			}

		} catch (FileNotFoundException e) {
			System.out.println();
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
	
		} finally {
			fileReader.close();
		}

		UserLoginService userService = new UserLoginService();
		Students[] users = new Students[3];

		for (int i = 0; i < 3; i++) {

			users[i] = userService.createUser("user" + (i + 1), "password" + (i + 1), "name" + (i + 1));

		}

	}
}
