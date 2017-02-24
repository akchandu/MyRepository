package com.study.threads;

class Priority extends Thread {
	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println("child thread");
		}
	}
}

public class PriorityDemo {

	public static void main(String[] args) throws InterruptedException {
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		
		Priority t = new Priority();
		t.setPriority(Thread.MAX_PRIORITY);
		t.start();
		System.out.println("child thread priority : " + t.getPriority());
		
		int priority = Thread.currentThread().getPriority();
		System.out.println("main thread priority : " + priority);
		
		for (int i = 0; i < 2; i++) {
			System.out.println("main thread");
		}

	}

}
