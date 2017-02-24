package com.study;

public class InitializingObject {
	
	int i;
	int j = 20;
	String str;
	
	static int k;

	public static void main(String[] args) {
		System.out.println("Hello world");
		
		InitializingObject obj = new InitializingObject();
		System.out.println(obj.i);
		System.out.println(obj.j);
		System.out.println(obj.str);
		System.out.println(InitializingObject.k);

	}

}
