package com.study.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable {
	transient final int i = 10;
	int j = 20;
}

public class SerializationEg {

	public static void main(String[] args) throws Exception {
		
		Dog d = new Dog();
		System.out.println("Values before serialization : " + d.i + " ... " + d.j);
		
		FileOutputStream fo = new FileOutputStream("abc.ser");
		@SuppressWarnings("resource")
		ObjectOutputStream outputStream = new ObjectOutputStream(fo);
		outputStream.writeObject(d);
		
		FileInputStream fi = new FileInputStream("abc.ser");
		ObjectInputStream inputStream = new ObjectInputStream(fi);
		Dog d1 = (Dog) inputStream.readObject();
		System.out.println("Values after serialization : " + d1.i + " ... " + d1.j);
	}

}
