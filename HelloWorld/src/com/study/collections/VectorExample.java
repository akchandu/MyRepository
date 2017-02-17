package com.study.collections;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		Vector v = new Vector(10,5);
		System.out.println(v.capacity());
		for (int i = 0; i < 10; i++) {
			v.addElement(10);
		}
		System.out.println(v.capacity());
		v.addElement(11);
		System.out.println(v.capacity());
	}
}
