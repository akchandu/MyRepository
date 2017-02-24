package com.study.threads;

class PrintDemo {
	public void printNumbers() {
		try {
			for (int i = 20; i > 0; i--) {
				System.out.println("Counter ---- " + i);
			}
		} catch (Exception e) {
			System.out.println("Thread interrupted");
		}
	}
}

class ThreadDemo extends Thread {
	private Thread t;
	private String threadName;
	PrintDemo pd;
	
	ThreadDemo (String threadName, PrintDemo pd) {
		this.threadName = threadName;
		this.pd = pd;
	}
	
	@Override
	public void run() {
		pd.printNumbers();
		System.out.println("Thread " + threadName + " exiting");
	}
	
	@Override
	public void start() {
		System.out.println("Thread " + threadName + " starting");
		if (null == t) {
			t = new Thread(this, threadName);
			t.start();
		}
	}
}

public class PrintNumbersNonSync {

	public static void main(String[] args) {
		PrintDemo pd = new PrintDemo();
		
		ThreadDemo t1 = new ThreadDemo("thread-1", pd);
		ThreadDemo t2 = new ThreadDemo("thread-2", pd);
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (Exception e) {
			System.out.println("Thread interrupted");
		}

	}

}
