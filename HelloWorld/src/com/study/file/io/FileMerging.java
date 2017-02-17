package com.study.file.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileMerging {

	public static void main(String[] args) throws IOException {
		//System.out.println("hello world");

		//find all *.txt files in a directory and merge into
		//one file
		File directory = new File("/home/kaddanki/Desktop/files_list");

		String[] fileNames = directory.list();

		/*for (String file : fileNames) {
			System.out.println(file);
		}*/

		File f = new File("/home/kaddanki/Desktop/files_list/file1.txt");
		BufferedReader br = new BufferedReader(new FileReader(f));
		String line = br.readLine();
		while (line != null) {
			System.out.println(line);
			line = br.readLine();
		}
		br.close();

		System.out.println();
		System.out.println("second file contents - ");
		br = new BufferedReader(new FileReader("/home/kaddanki/Desktop/files_list/file2.txt"));
		line = br.readLine();
		while (line != null) {
			System.out.println(line);
			line = br.readLine();
		}
		br.close();

		System.out.println();
		System.out.println("merging all files of directory to another file");
		PrintWriter pw = new PrintWriter("/home/kaddanki/Desktop/files_list/output.txt");
		String[] files = directory.list();

		for (String file : files) {
			if (file.endsWith(".txt")) {
				System.out.println(file);
			}
		}

		for (String file : files) {
			if (file.endsWith(".txt")) {
				File f1 = new File(directory, file);
				br = new BufferedReader(new FileReader(f1));
				line = br.readLine();
				while (line != null) {
					pw.println(line);
					line = br.readLine();
				}
			}
		}
		pw.flush();
		pw.close();
		br.close();

		//remove duplicates from file
		br = new BufferedReader(new FileReader("/home/kaddanki/Desktop/files_list/duplicate_file.txt"));
		pw = new PrintWriter("/home/kaddanki/Desktop/files_list/unique_entries.txt");
		line = br.readLine();

		while (line != null) {
			BufferedReader br1 = new BufferedReader(new FileReader("/home/kaddanki/Desktop/files_list/unique_entries.txt"));
			String line2 = br1.readLine();
			if (line != line2) {
				
			}
					
			pw.println(line);
			
			System.out.println(line);
			line = br.readLine();
		}
		pw.flush();
		pw.close();
		br.close();
		System.out.println("Writing to file completed");

	}

}
