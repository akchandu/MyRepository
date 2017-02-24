package com.study.wrappers;

import java.util.Random;

public class AutoboxingEgTwo {

	public static void main(String[] args) {
		System.out.println("hello world");
		
		System.out.print("case1 : ");
		Integer i1 = new Integer(10);
		Integer j1 = new Integer(10);
		System.out.println(i1 == j1);
		System.out.println();
		
		System.out.print("case2 : ");
		Integer i2 = new Integer(10);
		Integer j2 = i2;
		System.out.println(i2 == j2);
		System.out.println();
		
		System.out.print("case3 : ");
		Integer i3 = 10;
		Integer j3 = 10;
		System.out.println(i3 == j3);
		System.out.println();
		
		System.out.print("case4 : ");
		Integer i4 = 100;
		Integer j4 = 100;
		System.out.println(i4 == j4);
		System.out.println();
		
		System.out.print("case5 : ");
		Integer i5 = 1000;
		Integer j5 = 1000;
		System.out.println(i5 == j5);
		System.out.println();
		
		Math.random();
		
		

	}

}
