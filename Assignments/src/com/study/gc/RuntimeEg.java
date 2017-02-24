package com.study.gc;
import java.util.Date;

public class RuntimeEg {

	public static void main(String[] args) {
		System.out.println("Hello world");
		Runtime r = Runtime.getRuntime();
		
		System.out.println(r.totalMemory());
		System.out.println(r.freeMemory());
		
		for (int i = 0; i < 100000000; i++) {
			Date d = new Date();
			d = null;
		}
		
		System.out.println(r.freeMemory());
		r.gc();
		System.out.println(r.freeMemory());
		
		

	}

}
