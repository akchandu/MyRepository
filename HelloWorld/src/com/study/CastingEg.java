package com.study;

public class CastingEg {

	public static void main(String[] args) {
		System.out.println("Hello world");
		Object obj = new String("hello");
		Integer i = (Integer) obj;
		System.out.println(i);

	}

}
