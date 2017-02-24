package com.study.threads;

class JoinParentWait implements Runnable {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child thread");
		}
	}
}

public class JoinDemoParentWait {

	public static void main(String[] args) throws InterruptedException {
		JoinParentWait runnable = new JoinParentWait();
		Thread t = new Thread(runnable);
		t.start();
		t.join();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main thread");
		}
	}

}
