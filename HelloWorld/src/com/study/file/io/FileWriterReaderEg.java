package com.study.file.io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReaderEg {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("abc.txt");
		fw.write('a');
		fw.write("bc\nd");
		char[] ch = {'h','\n','e','l','l','o'};
		fw.write(ch);
		fw.close();
		
		System.out.println();
		System.out.println();
		System.out.println("Reading file using first approach");
		FileReader fr = new FileReader("abc.txt");
		int i = fr.read();
		while (i != -1) {
			System.out.print((char)i);
			i = fr.read();
		}
		fr.close();
		
		System.out.println();
		System.out.println();
		System.out.println("Reading file using second approach");
		File f = new File("abc.txt");
		FileReader fr1 = new FileReader("abc.txt");
		char[] characters = new char[(int) f.length()];
		//char[] characters = new char[3];
		fr1.read(characters);
		for (char c : characters) {
			System.out.print(c);
		}
		fr1.close();
	}

}
