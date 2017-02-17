package com.study.serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class TestE implements Externalizable {
	
	int i;
	int j;
	String str;
	
	public TestE() {
		System.out.println("constructor");
	}
	
	@Override
	public void writeExternal(ObjectOutput output) throws IOException {
		output.writeInt(i);
	}
	
	@Override
	public void readExternal(ObjectInput input) throws IOException, ClassNotFoundException {
		this.i = input.readInt();
	}
}

public class ExternalizableEg {
	
	public static void main(String[] args) throws Exception {
		
		TestE t = new TestE();
		t.i = 10;
		t.j = 20;
		t.str = "hello";
		
		FileOutputStream fout = new FileOutputStream("abcd.ser");
		ObjectOutputStream output = new ObjectOutputStream(fout);
		output.writeObject(t);
		
		FileInputStream fin = new FileInputStream("abcd.ser");
		ObjectInputStream input = new ObjectInputStream(fin);
		TestE t1 = (TestE) input.readObject();
		
		System.out.println(t1.i);
		System.out.println(t1.j);
		System.out.println(t1.str);

	}

}
