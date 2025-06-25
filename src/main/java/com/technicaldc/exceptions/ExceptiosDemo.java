package com.technicaldc.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptiosDemo {
	public static void show() {
		try {
			var reader = new FileReader("test.txt");
			reader.close();
		}
		catch (FileNotFoundException e) {
			// e.printStackTrace();
			System.out.println(e.getMessage());
		}
		catch (IOException io) {
			System.out.println(io.getMessage());
		}
	}

	public static void sayHello(String name) {
		System.out.println(name.toUpperCase());
	}
}
