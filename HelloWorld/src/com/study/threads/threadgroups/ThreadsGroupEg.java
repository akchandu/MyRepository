package com.study.threads.threadgroups;

class ThreadsGroupChild extends Thread {
	public void run() {
	}
}

public class ThreadsGroupEg {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
		
		ThreadsGroupChild t1 = new ThreadsGroupChild(); 
		
		ThreadGroup threadGroupOne = new ThreadGroup("GroupOne");
		threadGroupOne.setMaxPriority(6);
		Thread threadOne = new Thread(threadGroupOne, t1, "ThreadOne");
		threadOne.start();
		
		ThreadGroup threadGroupOneOne = new ThreadGroup(threadGroupOne, "GroupOneOne");
		threadGroupOne.list();
	}

}
