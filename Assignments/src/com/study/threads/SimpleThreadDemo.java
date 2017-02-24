package com.study.threads;

class SimpleThread extends Thread {
	public void run() {
		for (int i = 0; i < 40; i++) {
			System.out.println("child thread");
		}
	}
}

public class SimpleThreadDemo {

	public static void main(String[] args) {
		SimpleThread t = new SimpleThread();
		t.start();
		for (int i = 0; i < 40; i++) {
			System.out.println("main thread");
		}

	}

}
