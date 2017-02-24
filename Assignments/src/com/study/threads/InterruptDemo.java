package com.study.threads;

class InterruptThread extends Thread {
	public void run() {
		try {
			Thread.sleep(1000000);
		} catch (InterruptedException e) {
			System.out.println("interrupted exception caught");
		}
		System.out.println("end of run method");
	}
}

public class InterruptDemo {
	public static void main(String[] args) {
		InterruptThread t = new InterruptThread();
		t.start();
		t.interrupt();
		System.out.println("end of main method");
	}
}
