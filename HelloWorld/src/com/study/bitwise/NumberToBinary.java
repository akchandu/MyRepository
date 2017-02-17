package com.study.bitwise;

import java.util.Scanner;

public class NumberToBinary {

	public static void main(String[] args) {
		System.out.println("Hello world");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the integer");
		int number = scan.nextInt();
		
		if (number < 0) {
			System.out.println("Invalid number : negative number entered");
		} else {
			System.out.println("Binary format is : ");
			printBinaryForm(number);
		}
		System.out.println();
		System.out.println("Using api : " + Integer.toBinaryString(number));
		
 
	}
	
	private static void printBinaryForm(int number) {
		int remainder;
		
		if (number <= 1) {
			System.out.print(number);
			return;
		}
		
		remainder = number % 2;
		printBinaryForm(number >> 1);
		System.out.print(remainder);
	}

}
