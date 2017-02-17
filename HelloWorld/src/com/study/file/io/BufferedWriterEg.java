package com.study.file.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class BufferedWriterEg {

	public static void main(String[] args) throws IOException {
		System.out.println("hello world");
		
		FileWriter fw = new FileWriter("fileWriter.txt", true);
		/*fw.write(100);
		fw.write("\n");
		fw.write("efg");*/
		//fw.close();
		
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("hello");
		bw.newLine();
		bw.write("world");
		bw.close();

	}

}
