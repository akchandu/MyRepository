package com.study.collections;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<Object> s = new Stack<Object>();
		s.add("A");
		s.add("B");
		s.add("C");
		System.out.println(s);
		System.out.println(s.peek());
	}

}
