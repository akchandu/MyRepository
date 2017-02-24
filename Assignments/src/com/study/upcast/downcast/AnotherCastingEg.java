package com.study.upcast.downcast;

class Dog {
	public String getType() {
		System.out.println("Normal dog");
		return "Normal dog";
	}
}

class PetDog extends Dog {
	public String getType() {
		System.out.println("Pet dog");
		return "Pet dog";
	}
	public String dogName() {
		System.out.println("No name dog");
		return "No name dog";
	}
}

class PoliceDog extends Dog {
	public String getType() {
		System.out.println("Police dog");
		return "Police dog";
	}
	public String dogId() {
		System.out.println("Secret Dog ID");
		return "Secret Dog ID";
	}
	
}

public class AnotherCastingEg {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Dog petDog = new PetDog();
		Dog policeDog = new PoliceDog();
		
		dog.getType();
		petDog.getType();
		policeDog.getType();
		
		((PetDog) petDog).dogName();
		((PoliceDog) policeDog).dogId();
		
	}

}
