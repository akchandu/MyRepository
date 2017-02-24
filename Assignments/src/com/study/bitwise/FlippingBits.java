package com.study.bitwise;

import java.util.Iterator;
import java.util.Stack;

public class FlippingBits {

	static long maxInt = Long.MAX_VALUE;

	public static void main(String[] args) {
		//System.out.println("Hello world");

		System.out.println("maximum value is : " + maxInt);
		//flipBits();
		//binaryFormat(11);
		//addTrailingZeros(5);
		complimentNumber(2147483647);

	}

	static void flipBits() {
		System.out.println("flip bits method");
	}

	static long compliment(long number) {
		return (maxInt - number);
	}

	static void binaryFormat(int number) {
		int remainder = 0;
		Stack<Integer> s = new Stack<Integer>();
		while (number != 0) {
			remainder = number % 2;
			s.push(remainder);
			number = number / 2;
		}
		Iterator it = s.iterator();
		System.out.println("From stack : ");
		while (it.hasNext()) {
			System.out.print(s.pop());
		}
		System.out.println();
	}

	static void addTrailingZeros(int number) {
		int remainder = 0;
		StringBuffer binaryFormat = new StringBuffer();
		while (number != 0) {
			remainder = number % 2;
			binaryFormat.append(remainder);
			number = number / 2;
		}
		System.out.println(binaryFormat);
		System.out.println("in string format");
		System.out.println(binaryFormat.toString());
		int fromIndex = 32 - binaryFormat.length();
		int toIndex = 36;
		System.out.println(fromIndex);

		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < 32; i++) {
			buffer.append("0");
		}
		System.out.println("buffer length is : ");
		System.out.println(buffer.length());
		buffer.replace(fromIndex, toIndex, binaryFormat.toString());
		System.out.println(buffer);
	}

	static void complimentNumber (int number) {
		//step - 1 : find equivalent binary number
		int remainder = 0;
		StringBuffer binaryFormat = new StringBuffer();
		Stack<Integer> stack = new Stack<Integer>();
		while (number != 0) {
			remainder = number % 2;
			stack.push(remainder);
			number = number / 2;
		}
		Iterator stackIterator = stack.iterator();
		while (stackIterator.hasNext()) {
			binaryFormat.append(stack.pop());
		}
		System.out.print("binary format : " + binaryFormat.toString());
		System.out.println();

		//step - 2 : add trailing zeros to make length 32
		StringBuffer zeroBuffer = new StringBuffer();
		for (int i = 0; i < 32; i++) {
			zeroBuffer.append(0);
		}
		System.out.println("binaryFormat.length() : " + binaryFormat.length());
		int fromIndex = 32 - binaryFormat.length();
		int toIndex = 32;
		System.out.println("start index : " + fromIndex);
		System.out.println("toIndex : " + toIndex);
		zeroBuffer.replace(fromIndex, toIndex, binaryFormat.toString());
		System.out.println("zero buffer : " + zeroBuffer.toString());

		//step - 3 : replace 0 with 1 and 1 with 0
		String compliment = zeroBuffer.toString();
		char[] charArray = compliment.toCharArray();
		System.out.println(compliment);
		for (int i = 0; i < compliment.length(); i++) {
			if (charArray[i] == '0') {
				charArray[i] = '1';
			} else {
				charArray[i] = '0';
			}
		}
		System.out.println("Compliment");
		compliment = String.copyValueOf(charArray);
		System.out.print("compliment : " + compliment);
		System.out.println();

		//step - 4 : find the decimal equivalent of binary
		Stack newStack = new Stack();
		for (int i = 0; i < compliment.length(); i++) {
			newStack.push(compliment.charAt(i));
		}
		//		System.out.println("Stack contents : ");
		//		System.out.println(newStack);
		Iterator newStackIt = newStack.iterator();
		StringBuffer binaryReverse = new StringBuffer();
		while (newStackIt.hasNext()) {
			binaryReverse.append(newStack.pop());
		}
		System.out.println("Binary reverse : ");
		System.out.println(binaryReverse);

		long decimalValue = 0;
		long val = 0;
		for (int i = 0; i < binaryReverse.length(); i++) {
			int num = Character.getNumericValue(binaryReverse.charAt(i));
			//System.out.print(num);
			System.out.println();
			long res = num * ((int) Math.pow(2,i));
			//System.out.print("res : " + res);
			
			val = val + res;
			//System.out.println();
			//System.out.print("val : "  + val);
			decimalValue = decimalValue + res;
			//System.out.println();
			//System.out.print("decimalValue : " + decimalValue);
		}
		System.out.println();
		System.out.println("decimal : ");
		System.out.println(decimalValue);
		
		
		System.out.println("=============");
		{
			long decimalValue1 = 0;
			long val1 = 0;
			for (int i = compliment.length() - 1; i >=0 ; i--) {
				int num = Character.getNumericValue(compliment.charAt(i));
				//System.out.print(num);
				System.out.println();
				long res = num * ((long) Math.pow(2,i));
				//System.out.print("res : " + res);
				
				val1 = val1 + res;
				//System.out.println();
				//System.out.print("val : "  + val);
				decimalValue1 = decimalValue + res;
				//System.out.println();
				//System.out.print("decimalValue : " + decimalValue);
			}
			System.out.println();
			System.out.println("decimal : ");
			System.out.println(decimalValue1);
		}

	}
}
