package com.study.stringbuffer;

public class StringReverse {

	public static void main(String[] args) {
		System.out.println("hello world");
		String str = "hello";
		
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
		
		StringBuffer sb1 = new StringBuffer();
		for (int i = str.length()-1; i >= 0; i--) {
			sb1.append(str.charAt(i));
		}
		System.out.println(sb1);
	}
}
