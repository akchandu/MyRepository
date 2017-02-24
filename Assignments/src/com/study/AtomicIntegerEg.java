package com.study;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerEg  {


	public static void main(String[] args) {
		Thread t1 = new Thread(new TestAtomic());
		Thread t2 = new Thread(new TestAtomic());
		t1.start();
		t2.start();
	}
}

class TestAtomic implements Runnable {

	private static AtomicInteger integer = new AtomicInteger(0);

	int myCounter = 0;
	int myPreviousCounter = 0;
	int myCounterPlusFive = 0;

	public void run() {
		myCounter = integer.incrementAndGet();
		System.out.println("Thread - " + Thread.currentThread().getName() + "; counter is : " + myCounter);

		myPreviousCounter = integer.getAndIncrement();
		System.out.println("Thread - " + Thread.currentThread().getName() + "; previous counter is : " + myPreviousCounter);

		myCounterPlusFive = integer.addAndGet(5);
		System.out.println("Thread - " + Thread.currentThread().getName() + "; five plus counter is : " + myCounterPlusFive);
		System.out.println("child thread");
	}
}
