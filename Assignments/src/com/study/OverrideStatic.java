package com.study;

public class OverrideStatic {

	public static void main(String[] args) {
		Child.method1("asdsad");
	}

	public static void method1(String str) {
		System.out.println("static method of parent");
	}

	public void normalMethod(String str) {
		System.out.println("normal method of parent");
	}

}

class Child extends OverrideStatic {

}

