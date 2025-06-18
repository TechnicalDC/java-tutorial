package com.technicaldc.demo;

public class HelloWorld {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// Primitive: int, long, short, byte, char, float, double, boolean
		int variable = 28;
		byte age = 28;
		// Can use _ instead of comma in the number
		// adding L as suffix so that java dont consider it as int by default
		long viewCount = 3_123_456_789L;
		// adding F as suffix so that java dont consider it as double by default
		float price = 10.99F;
		char lang = 'E';
		boolean isActive = true;
		String hello = "Hello World";

		System.out.println(hello);
	}
}
