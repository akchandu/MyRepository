package com.study.thread.waitnotify;

class WaitNotify extends Thread {
	public void run() {
		synchronized (this) {
			System.out.println("child thread");
			for (int i = 0; i < 10; i++) {
				System.out.print(i + "\t");
			}
			this.notify();
		}
		
	}
}

public class WaitNotifyEg {

	public static void main(String[] args) throws InterruptedException {
		WaitNotify t = new WaitNotify();
		t.start();
		synchronized (t) {
			t.wait();
		}
		System.out.println();
		System.out.println("end of main");
	}

}
