package com.study;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class InitialValues {
	public static void main(String[] args) throws ArithmeticException {
		int i = 10/0;
		System.out.println("Hello world");
		System.out.println(i);
	}
	
	public void m1() throws FileNotFoundException {
		
	}
}

class ChildClass extends InitialValues {
}