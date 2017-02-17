package com.study.algo.strings;

public class StringPalindrome {

	public static void main(String[] args) {
		String string = "madam";
		System.out.println("Method - 1 : " + string + " is palindrome? " + getPalindromeOne(string));
		System.out.println("Method - 2 : " + string + " is palindrome? " + getPalindromeTwo(string));
		System.out.println("Method - 3 : " + string + " is palindrome? " + isPalindrome(string));
	}
	
	private static boolean getPalindromeOne(String str) {
		int count = 0;
		for (int i = 0 ; i < str.length(); i++) {
			if (str.charAt(i) == str.charAt(str.length() - 1 - i)) {
				count++;
			}
		}
		return (count == str.length());
	}
	
	private static boolean getPalindromeTwo(String str) {
		int count = 0;
		for (int i = 0; i < str.length()/2; i++) {
			if (str.charAt(i) == str.charAt(str.length() - 1 - i)) {
				count++;
			}
		}
		return (count == str.length()/2);
	}
	
	private static boolean isPalindrome(String str) {
		if (str.length() == 0 || str.length() == 1) {
			return true;
		}
		if (str.charAt(0) == str.charAt(str.length()-1))
			return isPalindrome(str.substring(1, str.length()-1));
		return false;
	}

}
