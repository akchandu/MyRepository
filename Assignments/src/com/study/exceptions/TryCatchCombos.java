package com.study.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryCatchCombos {

	public static void main(String[] args) {

		BufferedReader br = null;
		String currentLine = null;
		String fileName = "/home/kaddanki/hello.txt";
		try {
			br = new BufferedReader(new FileReader(fileName));
		} catch (FileNotFoundException e) {
			System.out.println("File is not foud in the mentioned path");
			fileName = "/home/kaddanki/hello1.txt";
			try {
				br = new BufferedReader(new FileReader(fileName));
			} catch (FileNotFoundException e1) {
				System.out.println("File not found in catch block too");
				System.out.println(e1.getStackTrace());
			}
		}
		try {
			while (((currentLine = br.readLine()) != null)) {
				System.out.println(currentLine);
			}
		} catch (IOException e) {
			System.out.println("IO Exception occurred");
		} catch (NullPointerException e) {
			System.out.println("Null pointer exception occurred");
		}finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException e) {
				System.out.println("Exception when closing the br");
			}
		}
		System.out.println("End of the program");

	}

}
