package com.coderscampus;

import java.awt.desktop.UserSessionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class FileService {
	public User[] readDataFromFile(String fileName) throws IOException {
		// Instantiate the array with the number of users
		User[] users = new User[5];
		for (int i = 0; i < 5; i++) {
			String line = fileName;

			// parse the strings with ", " a comma

			// Instantiate the BufferedReader
			try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
				int u = 0;
				// read file line by line and return the lines as a list of strings
				while ((line = fileReader.readLine()) != null) {
					

					String[] parts = line.split(", ");
					if (parts.length == 3) {
						users[u] = new User(parts[0], parts[1], parts[2]);

					}
				}

			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		return users;
	}

}
