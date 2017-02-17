package com.study.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ErrorEg {

	public static void main(String[] args) {
		try {
			System.out.println("Hello");
		} catch (RuntimeException e) {
			
		}
	}
	
	public void method1() throws FileNotFoundException {
		
	}

}

class ChildClass extends ErrorEg {
	public void method1() {
		
	}
}
