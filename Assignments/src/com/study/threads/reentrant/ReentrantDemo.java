package com.study.threads.reentrant;

import java.util.concurrent.locks.ReentrantLock;

class ReentrantEg extends Thread {
	static ReentrantLock l = new ReentrantLock();
	public void run() {
		System.out.println("child thread");
		l.lock();
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " ... " + i);
		}
		l.unlock();
	}
}

public class ReentrantDemo {

	public static void main(String[] args) {
		System.out.println("Hello world");
		ReentrantEg t1 = new ReentrantEg();
		ReentrantEg t2 = new ReentrantEg();
		t1.start();
		t2.start();
		System.out.println("end of main");

	}

}

