package com.study.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class ParentTwo {
	int i = 10;
	int j = 20;
	
	ParentTwo() {
		System.out.println("Parent constructor");
	}
}

class ChildTwo extends ParentTwo implements Serializable {
	int x = 30;
	int y = 40;
	
	ChildTwo() {
		System.out.println("Child constructor");
	}
}

public class InheritanceTypeTwo {

	public static void main(String[] args) throws Exception {
		System.out.println("Hello world");
		
		ChildTwo child = new ChildTwo();
		child.i = 80;
		child.j = 90;
		
		child.x = 60;
		child.y = 70;
		
		FileOutputStream fo = new FileOutputStream("abc.ser");
		ObjectOutputStream output = new ObjectOutputStream(fo);
		output.writeObject(child);
		
		FileInputStream fin = new FileInputStream("abc.ser");
		ObjectInputStream input = new ObjectInputStream(fin);
		ChildTwo child2 = (ChildTwo) input.readObject();
		
		System.out.println(child2.x + " ... " + child2.y);
		System.out.println(child2.i + " ... " + child2.j);

	}

}
