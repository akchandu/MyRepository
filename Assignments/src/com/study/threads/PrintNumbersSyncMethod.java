package com.study.threads;

class PrintDemoSyncMethod {
	public synchronized void printNumbers() {
		try {
			for (int i = 20; i > 0; i--) {
				System.out.println("Counter --- " + i);
			} 
		} catch (Exception e) {
			System.out.println("Thread interrupted");
		}
	}
}

class ThreadDemoSyncMethod extends Thread {
	private Thread t;
	private String threadName;
	PrintDemoSyncMethod pd;
	
	public ThreadDemoSyncMethod(String threadName, PrintDemoSyncMethod pd) {
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
			t = new Thread(this,threadName);
			t.start();
		}
	}
}

public class PrintNumbersSyncMethod {
	
	public static void main(String[] args) {
		System.out.println("Hello world");
		
		PrintDemoSyncMethod pd = new PrintDemoSyncMethod();
		ThreadDemoSyncMethod t1 = new ThreadDemoSyncMethod("Thread-1", pd);
		ThreadDemoSyncMethod t2 = new ThreadDemoSyncMethod("Thread-2", pd);
		
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
