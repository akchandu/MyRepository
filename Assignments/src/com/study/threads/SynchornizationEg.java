package com.study.threads;

class SynchThread extends Thread {
	int var = 0;
	public void run () {
		synchronized (this) {
			System.out.println("child thread computing");
			for (int i = 1; i <= 100; i++) {
				var = var + i;
			}
			System.out.println("child thread going to notify");
			this.notify();
		}
	}
}

public class SynchornizationEg {
	public static void main(String[] args) throws InterruptedException {
		SynchThread t = new SynchThread();
		t.start();
		synchronized (t) {
			System.out.println("main thread going to wait");
			t.wait();
			System.out.println("main thread getting notification");
			System.out.println(t.var);
		}
	}
}
