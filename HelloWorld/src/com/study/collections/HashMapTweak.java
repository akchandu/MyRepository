package com.study.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapTweak {
	int i;
/*	HashMapTweak(int i) {
		this.i = i;
	}*/
	
	public int method1() throws RuntimeException {
		return 1;
	}
	
	public static void main(String[] args) throws RuntimeException {
		//System.out.println("hello world");
		Map<HashMapTweak,String> hashmap = new HashMap<HashMapTweak,String>(15);
		HashMapTweak obj1 = new HashMapTweak();
		int i = 10;
		
		/*System.out.println(hashmap.size());
		
		HashMapTweak obj2 = new HashMapTweak();
		HashMapTweak obj3 = new HashMapTweak();
		HashMapTweak obj4 = new HashMapTweak();
		HashMapTweak obj5 = new HashMapTweak();
		HashMapTweak obj6 = new HashMapTweak();
		hashmap.put(obj1, "value1");
		hashmap.put(obj2, "value2");
		hashmap.put(obj3, "value3");
		hashmap.put(obj4, "value4");
		hashmap.put(obj5, "value5");
		hashmap.put(obj6, "value6");
		System.out.println(hashmap.size());*/
		
		System.out.println(obj1); //com.study.collections.HashMapTweak@20
		
	}
	@Override
	public int hashCode() {
		return 20;
	}
}

class ChildClass extends HashMapTweak {
	public int method1() throws NullPointerException {
		return 2;
	}
}


