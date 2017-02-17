package com.study.file.io;

import java.io.PrintWriter;
import java.io.IOException;

public class PrintWriterEg {

	public static void main(String[] args) throws IOException {
		System.out.println("hello world");
		
		PrintWriter pw = new PrintWriter("print-writer.txt");
		pw.write("c");
		pw.print('c');
		pw.println("abc");
		pw.println(true);
		pw.close();

	}

}
