package com.study.threads;

class PrintDemoSync {
	public void printNumbers() {
		try {
			for (int i = 25; i > 0; i--) {
				System.out.println("Counter --- " + i);
			} 
		} catch (Exception e) {
			System.out.println("Thread interrupted");
		}
	}
}

class ThreadDemoSync extends Thread {
	private Thread t;
	private String threadName;
	PrintDemoSync pd;
	
	ThreadDemoSync(String threadName, PrintDemoSync pd) {
		this.pd = pd;
		this.threadName = threadName;
	}
	
	@Override
	public void run() {
		synchronized(pd) {
			pd.printNumbers();
		}
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

public class PrintNumbersSync {

	public static void main(String[] args) {
		System.out.println("Hello world");
		PrintDemoSync pd = new PrintDemoSync();
		
		ThreadDemoSync t1 = new ThreadDemoSync("Thread-1", pd);
		ThreadDemoSync t2 = new ThreadDemoSync("Thread-2", pd);
		
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
