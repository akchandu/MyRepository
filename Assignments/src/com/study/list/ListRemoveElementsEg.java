package com.study.list;

import java.util.ArrayList;
import java.util.List;

public class ListRemoveElementsEg {

	public static void main(String[] args) {
		System.out.println("hello world");

		List<String> tsystems_ci = new ArrayList<String>();
		tsystems_ci.add("a");
		tsystems_ci.add("b");
		tsystems_ci.add("c");
		tsystems_ci.add("d");
		tsystems_ci.add("e");

		List<String> cis_to_delete = new ArrayList<String>();

		cis_to_delete.add("a");
		cis_to_delete.add("b");
		cis_to_delete.add("c");
		cis_to_delete.add("d");
		cis_to_delete.add("e");

		//cis_to_delete.removeAll(tsystems_ci);

		for (String str : cis_to_delete) {
			if (str.equalsIgnoreCase("a")) {
				int index = cis_to_delete.indexOf("a");
				cis_to_delete.set(index, "B");
			}
			//System.out.println(str);
		}

		for (String str1 : cis_to_delete) {
			System.out.println(str1);
		}

		cis_to_delete.clear();
		System.out.println("after delete :");

		for (String str1 : cis_to_delete) {
			System.out.println(str1);
		}
		
		List<String> abc = new ArrayList<String>();
		abc.clear();
		System.out.println("list cleared");



	}

}
