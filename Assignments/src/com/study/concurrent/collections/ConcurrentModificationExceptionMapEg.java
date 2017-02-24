package com.study.concurrent.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class ConcurrentModificationExceptionMapEg extends Thread {

	//static ConcurrentHashMap<String,String> map = new ConcurrentHashMap<String,String>();
	
	static HashMap<String,String> map = new HashMap<String,String>();
	
	
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("child class adding new entry");
		map.put("104", "104-value");
	}
	
	public static void main(String[] args) {
		System.out.println("hello world");
		
		map.put("101", "101-value");
		map.put("102", "102-value");
		map.put("103", "103-value");
		
		ConcurrentModificationExceptionMapEg t = new ConcurrentModificationExceptionMapEg();
		t.start();
		
		Set s = map.keySet();
		Iterator itr = s.iterator();
		while (itr.hasNext()) {
			String str = (String) itr.next();
			System.out.println("parent class iterating and object is : " + str);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
