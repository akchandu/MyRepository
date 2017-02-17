package com.study.threads;

class A {
	public synchronized void d1(B b) {
		System.out.println("before calling last method of B");
		b.last();
	}

	public synchronized void last() {
		System.out.println("inside last of A");
	}
}

class B {
	public synchronized void d2(A a) {
		System.out.println("before calling last method of A");
		a.last();
	}

	public synchronized void last() {
		System.out.println("inside last of B");
	}

}

public class DeadlockEg extends Thread {

	A a = new A();
	B b = new B();
	
	public void run() {
		
	}
	public static void main(String[] args) {
		System.out.println("Hello world");

	}

}
