package com.study.threads;

class JoinChildWait implements Runnable {
	public static Thread mainThread;
	public void run() {
		try {
			mainThread.join();
		} catch(InterruptedException e) {
			System.out.println("Interrupted exception");
		}
		for (int i = 0; i < 10; i++) {
			System.out.println("Child thread");
		}
	}
}

public class JoinDemoChildWait {

	public static void main(String[] args) {
		JoinChildWait.mainThread = Thread.currentThread();
		JoinChildWait runnable = new JoinChildWait();
		Thread t = new Thread(runnable);
		t.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Main thread");
		}

	}

}
