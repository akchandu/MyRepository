package com.study.thread.waitnotify;

class OddEvenThing extends Thread {
	private static boolean evenFlag = true;
	public synchronized void run() {
		if (evenFlag == true) {
			printEven();
		} else {
			printOdd();
		}
	}
	public void printEven() {
		for (int i = 0 ; i < 10; i = i + 2) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
		evenFlag = false;
	}
	public void printOdd() {
		for (int i = 1; i < 9; i = i + 2) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
		evenFlag = true;
	}
}

public class OddEvenAnother {
	public static void main(String[] args) {
		System.out.println("Hello world");
		OddEvenThing t1 = new OddEvenThing();
		OddEvenThing t2 = new OddEvenThing();
		t1.start();
		t2.start();
	}
}
