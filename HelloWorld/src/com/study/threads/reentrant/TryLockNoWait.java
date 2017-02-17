package com.study.threads.reentrant;
import java.util.concurrent.locks.ReentrantLock;

class TryLockEg extends Thread {
	static ReentrantLock l = new ReentrantLock();
	TryLockEg(String name) {
		super(name);
	}
	public void run() {
		if (l.tryLock()) {
			System.out.println(Thread.currentThread().getName() + " ... Performing safe operations");
		} else {
			System.out.println(Thread.currentThread().getName() + " ... Performing alternative operations");
		}
	}
}

public class TryLockNoWait {

	public static void main(String[] args) {
		System.out.println("hello world");
		TryLockEg t1 = new TryLockEg("First thread");
		TryLockEg t2 = new TryLockEg("Second thread");
		t1.start();
		t2.start();
	}

}
