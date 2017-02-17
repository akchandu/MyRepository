package com.study.exceptions;

public class CustomExceptionUse {
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Hello world");
		int number = 6;
		if (number < 8) {
			throw new InvalidNumberException("Number is invalid");
		} else {
			System.out.println(number);
			Thread.sleep(10);
		}
	}
}
