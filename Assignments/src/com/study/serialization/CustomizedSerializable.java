package com.study.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account implements Serializable {
	String username = "abc";
	String password = "abc!@xyz";
	
	private void writeObject(ObjectOutputStream output) throws Exception {
		output.defaultWriteObject();
		password = "123" + password;
		output.writeObject(password);
	}
	
	private void readObject(ObjectInputStream input) throws Exception {
		input.defaultReadObject();
		String newPassword = (String) input.readObject();
		this.password = newPassword.substring(3);
	}
	
}

public class CustomizedSerializable {

	public static void main(String[] args) throws Exception {
		System.out.println("Hello world");
		
		Account account1 = new Account();
		
		System.out.println("Values before serialization : " + account1.username + " ... " + account1.password);
		
		FileOutputStream fo = new FileOutputStream("abc.ser");
		ObjectOutputStream output = new ObjectOutputStream(fo);
		output.writeObject(account1);
		
		FileInputStream fin = new FileInputStream("abc.ser");
		ObjectInputStream input = new ObjectInputStream(fin);
		Account account2 = (Account) input.readObject();
		
		System.out.println("Values after serialization : " + account2.username + " ... " + account2.password);
		

	}

}
