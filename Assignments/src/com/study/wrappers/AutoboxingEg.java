package com.study.wrappers;

public class AutoboxingEg {

	public static void main(String[] args) {
		System.out.println("hello world");
		
		Integer i = 10;
		Integer j = i;
		i++;
		System.out.println(i);
		System.out.println(j);
		System.out.println(i==j);

	}

}
