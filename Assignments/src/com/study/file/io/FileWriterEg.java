package com.study.file.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEg {

	public static void main(String[] args) throws IOException {
		System.out.println("hello world");
		FileWriter fw = new FileWriter("file-writer-1.txt");
		fw.write(100);
		fw.close();
	}
}
