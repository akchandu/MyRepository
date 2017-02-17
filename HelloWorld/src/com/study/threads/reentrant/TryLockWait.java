package com.study.threads.reentrant;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class TryLockWaitEg extends Thread {
	static ReentrantLock l = new ReentrantLock();
	TryLockWaitEg(String name) {
		super(name);
	}
	public void run() {
		System.out.println("child thread");
		do {
			try {
				if (l.tryLock(5000, TimeUnit.MILLISECONDS)) {
					System.out.println(Thread.currentThread().getName() + "... got the lock");
					System.out.println(Thread.currentThread().getName() + " ... Performing safe operations");
					Thread.sleep(30000);
					System.out.println(Thread.currentThread().getName() + " ... releasing the lock");
					l.unlock();
					break;
				} else {
					System.out.println(Thread.currentThread().getName() + " ... Performing alternative operations");
				}
			} catch(Exception e) {
				
			}
		} while(true);
	}
}
public class TryLockWait {
	public static void main(String[] args) {
		System.out.println("hello world");
		TryLockWaitEg t1 = new TryLockWaitEg("First thread");
		TryLockWaitEg t2 = new TryLockWaitEg("Second thread");
		t1.start();
		t2.start();
	}

}
