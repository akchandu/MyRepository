package com.study.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapExample {

	private static Map<String,String> stringMap = new HashMap<String,String>();

	public static Map<String, String> getStringMap() {
		return stringMap;
	}

	public static void setStringMap(Map<String, String> stringMap) {
		MapExample.stringMap = stringMap;
	}

	public static void main(String[] args) {
		/*stringMap.put("parent1", "");
		stringMap.put("child1", "");
		stringMap.put("parent2", "");
		stringMap.put("child2", "");
		stringMap.put("parent3", "");
		stringMap.put("child3", "");*/
		/*stringMap.put("key1", "");
		stringMap.put("key2", "");
		stringMap.put("key3", "");
		stringMap.put("key4", "");
		stringMap.put("key5", "");
		stringMap.put("key6", "");*/
		stringMap.put("ASSIGNED_GROUP", "assigned group");
		stringMap.put("STATUS_REASON_TYPE", "status reason type");
		stringMap.put("VENDOR_NAME", "vendor name");
		stringMap.put("VENDOR_ORGANIZATION", "vendor organization");
		stringMap.put("STATUS_TYPE", "status type");
		stringMap.put("VENDOR_GROUP", "vendor group");

		Map<String,String> anotherMap = getStringMap();

		Map<String,String> linkedMap = new LinkedHashMap<String,String>();

		if (!anotherMap.isEmpty()) {
			for (String str : anotherMap.keySet()) {
				if (str.equals("ASSIGNED_GROUP")) System.out.println("ASSIGNED_GROUP");
				if (str.equals("STATUS_REASON_TYPE")) System.out.println("STATUS_REASON_TYPE");
				if (str.equals("VENDOR_NAME")) System.out.println("VENDOR_NAME");
				if (str.equals("VENDOR_ORGANIZATION")) System.out.println("VENDOR_ORGANIZATION");
				if (str.equals("STATUS_TYPE")) System.out.println("STATUS_TYPE");
				if (str.equals("VENDOR_GROUP")) System.out.println("VENDOR_GROUP");
				/*if (str.equals("key1")) System.out.println("value1");
				if (str.equals("key2")) System.out.println("value2");
				if (str.equals("key3")) System.out.println("value3");
				if (str.equals("key4")) System.out.println("value4");
				if (str.equals("key5")) System.out.println("value5");
				if (str.equals("key6")) System.out.println("value6");*/
				/*if (str.equals("parent1")) System.out.println("parent1");
				if (str.equals("child1")){ 
					System.out.println("child1");
					linkedMap.put("parent1", "");
					linkedMap.put("child1", "");
				}
				if (str.equals("parent2")) System.out.println("parent2");
				if (str.equals("child2")){
					System.out.println("child2");
					linkedMap.put("parent2", "");
					linkedMap.put("child2", "");
				}
				if (str.equals("parent3")) System.out.println("parent3");
				if (str.equals("child3")) {
					System.out.println("child3");
					linkedMap.put("parent3", "");
					linkedMap.put("child3", "");
				}*/
				if (!str.equals("STATUS_REASON_TYPE") && !str.equals("STATUS_TYPE")) {
					linkedMap.put(str, anotherMap.get(str));
				} else {
					if (str.equals("STATUS_REASON_TYPE")) {
						linkedMap.put("STATUS_TYPE", anotherMap.get("STATUS_TYPE"));
						linkedMap.put("STATUS_REASON_TYPE", anotherMap.get("STATUS_REASON_TYPE"));
					}
				}
			}
		} else {
			System.out.println("Empty");
		}

		System.out.println();
		System.out.println("======================================");
		System.out.println("From Linked hashmap");
		System.out.println();
		if (!linkedMap.isEmpty()) {
			for (String str : linkedMap.keySet()) {
				System.out.println(str);
			}
		}
	}
}

