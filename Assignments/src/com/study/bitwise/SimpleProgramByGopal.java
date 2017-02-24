package com.study.bitwise;

public class SimpleProgramByGopal {

	public static void main(String[] args) {
		long number = 10;
		binaryFormat(number);

	}
	
	static void binaryFormat(long number) {
		char[] binaryArray = new char[32];
		String binaryvalue = "";
		int counter=31;
		while(number>0) {
		//	binaryvalue = binaryvalue + number %2;
			binaryArray[counter--] =(char) (number %2);
			number = number/2;
		}
		for(char a : binaryArray) {
			System.out.print((int)a);
		}
		System.out.println();
		binaryArray = flip(binaryArray);
		for(char a : binaryArray) {
			System.out.print((int)a);
		}
		System.out.println();
	    System.out.println(binaryToDecimal(binaryArray));
	}
	
	static char[] flip(char[] binaryArray) {
		for(int i=0,j=binaryArray.length-1;i<j;i++,j--) {
			char temp = binaryArray[i];
			binaryArray[i]=binaryArray[j];
			binaryArray[j]  =temp;
		}
		return binaryArray;
	}
	
	static int binaryToDecimal(char[] binaryArray) {
		int value=0,counter=0;
		
		for(int i=binaryArray.length-1;i>=0;i--) {
			value = value + (2*counter++)* (int)binaryArray[i];
		}
		return value;
	}

}
