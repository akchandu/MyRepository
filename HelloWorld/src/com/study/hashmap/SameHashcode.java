package com.study.hashmap;

import java.util.HashMap;
import java.util.Map;

class Dog {
	String name;
	String color;
	
	public int hashCode() {
		return this.name.hashCode();
	}
	public boolean equals(Object obj) {
		return this.name.equals(((Dog) obj).name);
	}
}

class Owner {
	String name;
	String location;
}

public class SameHashcode {

	public static void main(String[] args) {
		Map<Dog,Owner> map = new HashMap<Dog,Owner>();
		Dog d1 = new Dog();
		d1.name = "dog1";
		Dog d2 = new Dog();
		d2.name = "dog2";
		Dog d3 = new Dog();
		d3.name = "dog3";
		
		Owner o1 = new Owner();
		Owner o2 = new Owner();
		Owner o3 = new Owner();
		
		o1.name = "owner1";
		o2.name = "owner2";
		o3.name = "owner3";
		
		map.put(d1, o1);
		map.put(d2, o2);
		map.put(d3, o3);
		
		findOwner("dog1", map);
		
	}
	
	public static void findOwner(String dogName, Map<Dog,Owner> m) {
		System.out.println("given dog name : " + dogName);
		Dog lostDog = new Dog();
		lostDog.name = dogName;
		Owner cryingOwner = (Owner) m.get(lostDog);
		System.out.println(cryingOwner.name);
	}
}
