package com.study.concurrent.collections;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListEg {

	public static void main(String[] args) {
		System.out.println("hello world");
		
		CopyOnWriteArrayList<String> cowAl = new CopyOnWriteArrayList<String>();
		ArrayList<String> normalList = new ArrayList<String>();
		
		
		System.out.println("normal list elements - ");
		normalList.add("a");
		normalList.add("b");
		normalList.add("c");
		normalList.add("2");
		System.out.println(normalList);
		
		System.out.println("copy on write array list elements - ");
		cowAl.add("1");
		cowAl.add("2");
		cowAl.add("2");
		cowAl.addIfAbsent("2");
		System.out.println(cowAl);
		
		cowAl.addAllAbsent(normalList);
		
		System.out.println("after adding normal list - ");
		System.out.println(cowAl);
		

	}

}
