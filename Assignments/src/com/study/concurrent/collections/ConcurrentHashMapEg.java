package com.study.concurrent.collections;

import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

public class ConcurrentHashMapEg {

	public static void main(String[] args) {
		System.out.println("hello world");
		
		ConcurrentHashMap<String,String> map = new ConcurrentHashMap<String,String>();
		
		map.put("101", "abc");
		map.put("102", "xyz");
		map.put("103", "pqr");
		
		map.putIfAbsent("103", "lmn");
		System.out.println("map before removing :" + map);
		map.remove("104");
		System.out.println("map after removing :" + map);
		
		System.out.println("done");

	}

}
