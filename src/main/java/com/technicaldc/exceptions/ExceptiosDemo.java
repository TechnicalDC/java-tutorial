package com.technicaldc.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptiosDemo {
	public static void show() {
		FileReader reader = null;

		try {
			reader = new FileReader("test.txt");
		}
		catch (IOException io) {
			System.out.println(io.getMessage());
		}
		/* catch (FileNotFoundException e) { */
		/* 	// e.printStackTrace(); */
		/* 	System.out.println(e.getMessage()); */
		/* } */
		finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void sayHello(String name) {
		System.out.println(name.toUpperCase());
	}
}
