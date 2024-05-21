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
			users[i] = UserService.createUser("username" + (i+1), "password" + (i+1), "name" + (i+1));
		}
		System.out.println(Arrays.toString(users));
		
		
		
		//
		BufferedReader fileReader = new BufferedReader(new FileReader(fileName));

		String line;
		int i = 0;

		// this while loop iterates the data.txt file and parses it
		while ((line = fileReader.readLine()) != null) {
			System.out.println(line);

		
	

		
	}
		return users;
}}
