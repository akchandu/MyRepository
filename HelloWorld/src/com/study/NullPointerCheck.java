package com.study;

public class NullPointerCheck {

	public static void main(String[] args) {
		
		String str = "hello";
		String nullStr = null;
		
		if (!nullStr.equals("true")) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

	}

}
