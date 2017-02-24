package com.study.upcast.downcast;

class Animal {
	public void callMe() {
		System.out.println("call me of animal");
	}
	
	public static void animalStaticMethod() {
		System.out.println("Animal's static method");
	}
	
}

class Cat extends Animal {
	public void callMe() {
		System.out.println("call me of Cat");
	}
	public void shoutMe() {
		System.out.println("shouting at Cat");
	}
	
	public static void animalStaticMethod() {
		System.out.println("Cat's static method");
	}

}

public class CastingEg {

	public static void main(String[] args) {
		Cat d = new Cat();
		Animal a = (Animal) d;
		d.callMe();
		a.callMe();
		((Cat) a).shoutMe();
		
		if (a instanceof Cat) {
			System.out.println("a is instance of Cat");
		} else {
			System.out.println("a is not instance of Cat");
		}
		
		Animal.animalStaticMethod();
		Cat.animalStaticMethod();

	}

}
