package com.study.threads.executors;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

class PrintNumbers implements Runnable {
	String name;
	PrintNumbers(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " ... starting child thread");
		System.out.println(Thread.currentThread().getName() + " ... ending child thread");

	}
}

public class ExecutorsEg {

	public static void main(String[] args) {
		System.out.println("hello world");
		PrintNumbers[] jobs = {new PrintNumbers("ravi"),
				new PrintNumbers("siva"),
				new PrintNumbers("durga"),
				new PrintNumbers("reddy"),
				new PrintNumbers("murthy"),
				new PrintNumbers("ranga")};

		ExecutorService service = Executors.newFixedThreadPool(3);
		for (PrintNumbers j : jobs)
			service.execute(j);
	}
}
