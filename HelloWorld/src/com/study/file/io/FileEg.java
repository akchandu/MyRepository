package com.study.file.io;

import java.io.File;
import java.io.IOException;

public class FileEg {
	public static void main(String[] args) throws IOException {
		System.out.println("hello world");
		
		File f = new File("abc.txt");
		if (f.exists()) {
			System.out.println("file exists");
		} else {
			System.out.println("file does not exist");
		}
		if (!f.exists()) {
			f.createNewFile();
		}
		
		File directory = new File("abcd-directory");
		if (!directory.exists()) {
			directory.mkdir();
		}
	}
}
