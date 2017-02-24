package com.study.bitwise;

public class MissingElement {

	public static void main(String[] args) {
		System.out.println("Hello world");
		
		int[] array = {1,2,3,4,6,8,9};
		
		int o = array[0];
		
		for (int i = 1; i < array.length; i++) {
			o = o ^ array[i];
		}
		System.out.println(o);
		
		for (int i = 1; i <= array.length; i++) {
			o = o ^ i;
		}
		
		
		System.out.println(o);
		
		int y = 0;
		
		for (int i = 0; i < array.length; i++) {
			y = y ^ array[i];
		}
		
		for (int i = 1; i <= array.length; i++) {
			y = y ^ i;
		}
		
		System.out.println("y is : " + y);
		
		int oneTwo = 1 ^ 2;
		int twoThree = 2 ^ 3;
		int threeFour = 3 ^ 4;
		int fourFive = 4 ^ 5;
		int fiveSix = 5 ^ 6;
		int sixSeven = 6 ^ 7;
		int sevenEight = 7 ^ 8;
		int eightNine = 8 ^ 10;
		
		System.out.println("oneTwo : " + oneTwo);
		System.out.println("twoThree : " + twoThree);
		System.out.println("threeFour : " + threeFour);
		System.out.println("fourFive : " + fourFive);
		System.out.println("fiveSix : " + fiveSix);
		System.out.println("sixSeven : " + sixSeven);
		System.out.println("sevenEight : " + sevenEight);
		System.out.println("eightNine : " + eightNine);
		
		//System.out.println("Missing element is : " + missingElement);

	}

}
