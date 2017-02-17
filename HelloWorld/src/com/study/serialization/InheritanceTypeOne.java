package com.study.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Parent implements Serializable {
	transient int i = 10;
	int j = 20;
}

class Child extends Parent {
	int x = 30;
	int y = 40;
}

public class InheritanceTypeOne {

	public static void main(String[] args) throws Exception {
		System.out.println("Hello world");
		
		Child child = new Child();
		
		FileOutputStream fo = new FileOutputStream("abc.ser");
		ObjectOutputStream output = new ObjectOutputStream(fo);
		output.writeObject(child);
		
		FileInputStream fin = new FileInputStream("abc.ser");
		ObjectInputStream input = new ObjectInputStream(fin);
		Child obj = (Child) input.readObject();
		
		System.out.println(obj.x + " ... " + obj.y);
		System.out.println(obj.i + " ... " + obj.j);
	
	}

}
