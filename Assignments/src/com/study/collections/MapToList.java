package com.study.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapToList {

	public static void main(String[] args) {
		System.out.println("Hello world");
		
		Map m = new HashMap();
		m.put("1","a");
		m.put("2","b");
		m.put("3","c");
		m.put("4","d");
		m.put("5","e");
		
		List l1 = new ArrayList(m.entrySet());
		//for (int i = 0; i < l.size(); i++) {
			System.out.println(l1);
		//}
			
		List l2 = new ArrayList(m.keySet());
		System.out.println(l2);
		
		List l3 = new ArrayList(m.values());
		System.out.println(l3);

	}

}
