package com.study.threads;

class DaemonThread implements Runnable {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("child thread");
		}
	}
}

public class DaemonThreadEg {
	public static void main(String[] args) {
		System.out.println("main thread is daemon? " + Thread.currentThread().isDaemon());
		//Thread.currentThread().setDaemon(true); //throws IllegalThreadStateException
		DaemonThread r = new DaemonThread();
		Thread t = new Thread(r);
		System.out.println("child thread before setting as daemon : " + t.isDaemon());
		t.setDaemon(true);
		System.out.println("child thread after setting as daemon : " + t.isDaemon());
		t.start();
		System.out.println("end of main");
	}

}
