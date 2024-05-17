package com.coderscampus;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileService {
	public Users[] readDataFromFile(String fileName) throws IOException {
		// Instantiate the array with the number of users
		Users[] users = new Users[4];
		
		for (int i = 0; i < 4; i++) {
			
		}
		System.out.println(users);
		// Read file
		BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
		String user;
		int i = 0;

		// this while loop iterates the data.txt file and parses it
		while ((user = fileReader.readLine()) != user) {
			String[] parts = user.split(",");
			System.out.println(user);
			String email = parts[0];
			String password = parts[1];
			String name = parts[2];
			users[i] = (new Users(email, password, name));
			i++;
		}

		return users;
	}
}
