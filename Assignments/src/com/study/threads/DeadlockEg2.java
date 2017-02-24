package com.study.threads;

public class DeadlockEg2 {
	
	public static void main(String[] args) {
		System.out.println("hello");
		
		final Object resource1 = "resource1";
		final Object resource2 = "resource2";

		
		Thread t1 = new Thread() {
			public void run() {
				synchronized(resource1) {
					System.out.println("t1 trying to acquire resource1");
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					synchronized(resource2) {
						System.out.println("t1 trying to acquire resource2");
					}
				}
				
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				synchronized(resource2) {
					System.out.println("t2 trying to acquire resource2");
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					synchronized(resource1) {
						System.out.println("t2 trying to acquire resource1");
					}
				}
			
			}
			
		};
		t1.start();
		t2.start();

	}

}
