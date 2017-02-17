package com.study.gc;

class Test {
	int j = 10;
}

public class OutOfMemEg {

	public static void main(String[] args) {
		System.out.println("hello");
		for (int i = 0 ; i < 1000000000; i++) {
			Test t = new Test();
			t = null;
		}
	} 
	
	public void finalize() throws Throwable {
		System.out.println("finalize method called");
		
	}

}
