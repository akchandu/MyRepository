package com.study.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class A implements Serializable {
	int i = 10;
	int j = 20;
}

class B implements Serializable {
	int x = 30;
	int y = 40;
	A a = new A();
}

class C implements Serializable {
	int l = 50;
	int m = 60;
	A a = new A();
	B b = new B();
}

public class ObjectGraph {

	public static void main(String[] args) throws Exception {
		System.out.println("Hello world");
		
		C c = new C();
		
		FileOutputStream fo = new FileOutputStream("abc.ser");
		ObjectOutputStream output = new ObjectOutputStream(fo);
		output.writeObject(c);
		
		FileInputStream fin = new FileInputStream("abc.ser");
		ObjectInputStream input = new ObjectInputStream(fin);
		C c1 = (C) input.readObject();
		
		System.out.println(c1.l + " ... " + c1.m);
		System.out.println(c1.a.i + " ... " + c1.a.j);
		System.out.println(c1.b.x + " ... " + c1.b.y);

	}

}
