package com.study.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List al = new ArrayList(10);
		System.out.println(al.size());
		al.add("A");
		al.add("B");
		al.add("C");
		al.add(10);
		System.out.println(al.size());
		al.remove(1);
		System.out.println(al);
		
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("string1");
		arrayList.add("string2");
		arrayList.add("string3");
		arrayList.add("string4");
		
		if (arrayList.contains("string3")) {
			System.out.println("contains");
		} else {
			System.out.println("does not contain");
		}
 		

	}

}
