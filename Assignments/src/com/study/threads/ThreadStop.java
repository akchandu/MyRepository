package com.study.threads;

class ThreadStopThread implements Runnable {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("child thread");
		}
	}
}

public class ThreadStop {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		ThreadStopThread r = new ThreadStopThread();
		Thread t = new Thread(r);
		t.start();
		System.out.println("end of main");
		t.stop();

	}

}
