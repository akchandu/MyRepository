package com.study.thread.waitnotify;

public class OddEven extends Thread {

	volatile static int i = 1;
	Object lock;

	OddEven(Object lock) {
		this.lock = lock;
	}

	public static void main(String[] args) throws InterruptedException {
		Object obj = new Object();
		System.out.println("Hello world");
		OddEven odd = new OddEven(obj);
		OddEven even = new OddEven(obj);
		odd.setName("odd");
		even.setName("even");
		odd.start();
		even.start();
		System.out.println("end of main");
	}

	public void run() {
		while (i < 10) {
			if (i % 2 == 1 && Thread.currentThread().getName().equals("odd")) {
				synchronized(lock) {
					System.out.println(Thread.currentThread().getName() + " : " + i);
					i = i + 1;
					try {
						lock.wait();
					} catch (InterruptedException e) {
						System.out.println("interrupted");
					}
				}
			}
			if (i % 2 == 0 && Thread.currentThread().getName().equals("even"))
			{
				synchronized(lock) {
					System.out.println(Thread.currentThread().getName() + " : " + i);
					i = i + 1;
					lock.notify();
				}
			}
		}
	}

}
