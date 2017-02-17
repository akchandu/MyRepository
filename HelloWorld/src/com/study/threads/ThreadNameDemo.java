package com.study.threads;

class ThreadName implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("child thread");
		}
	} 
	
}

public class ThreadNameDemo {

	public static void main(String[] args) {
		String threadName = Thread.currentThread().getName();
		System.out.println("Thread name is : " + threadName);
		
		ThreadName runnable = new ThreadName();
		Thread t = new Thread(runnable);
		t.setName("child thread");
		t.start();
		System.out.println("child thread name is : " + t.getName());
		
	}
}
