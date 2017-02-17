package com.study.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sublists {

	public static void main(String[] args) {
		System.out.println("hello");
		
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		
		list1.add("a");
		list1.add("c");
		list1.add("b");
		list1.add("d");
		
		list2.add("a");
		list2.add("c");
		
		System.out.println(Collections.indexOfSubList(list1,list2));

	}

}
