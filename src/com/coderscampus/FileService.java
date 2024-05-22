package com.coderscampus;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class FileService {
	public User[] readDataFromFile(String fileName) throws IOException {
		// Instantiate the array with the number of users
		User[] users = new User[5];
		for (int i = 0; i < 5; i++) {
			users[i] = UserService.createUser("username" + (i + 1), "password" + (i + 1), "name" + (i + 1));
		}
		System.out.println(Arrays.toString(users));
		try (// Instantiate the BufferedReader
				BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
			String line;
			int i = 0;

			// read file line by line and return the lines as a list of strings
			while ((line = fileReader.readLine()) != null) {
				System.out.println(line);
				// split line by line
				String[] parts = line.split(", ");
				String username = parts[0];
				String password = parts[1];
				String name = parts[2];
				users[i] = new User(parts[0], parts[1], parts[2]);
				
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		return users;

	}
	
}
