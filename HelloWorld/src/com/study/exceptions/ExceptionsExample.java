package com.study.exceptions;

import java.io.IOException;

public class ExceptionsExample {

	public static void main(String[] args) throws Exception {
		int i = 10;
		if (i % 2 != 0) throw new Exception("Odd numbers not allowed");
		
		A obj1 = new A();
		obj1.m1();
		
		B obj2 = new B();
		obj2.m1();
		
		A objA = new B();
		objA.m1();
	}
}

class A {
	public void m1() throws ClassCastException {
		System.out.println("A method");
	}
	
}

class B extends A {
	public void m1() throws RuntimeException {
		System.out.println("B method");
	}
}
