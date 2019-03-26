package com.capgemini.file;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileHandlingDemo {
public static void main(String[] args) throws IOException {
	
	/*File file=new File("C:\\css workspace\\README.md");
	System.out.println(file.exists());
	
	File file1=new File("tex.txt");
	System.out.println(file1.exists());
	
	File file2=new File("text.txt");
	if(!file2.exists()) {
		file2.createNewFile();
		System.out.println("file created");	
	}
	
	//FileWriter writer=new FileWriter(file2,true);
	//BufferedWriter writer=new BufferedWriter(new FileWriter(file2));
	PrintWriter writer=new PrintWriter(new FileWriter(file2,true));
	writer.println("hi\n");
	writer.println("bye\n");
	writer.close();
	
	
}*/
		/*
		 * FileReader reader=new
		 * FileReader("C:\\Anushree\\core java\\basic java\\src\\Armstrong.java");
		 * BufferedReader reader1=new BufferedReader(reader);
		 * 
		 * PrintWriter writer=new PrintWriter("Bank.java"); String content;
		 * 
		 * while((content=reader1.readLine())!=null) { //System.out.println(content);
		 * writer.println(content); } System.out.println("success"); writer.close();
		 * reader1.close(); reader.close();
		 */
	
		/*
		 * File windowsDirectory=new File("\\c:\\windows");
		 * System.out.println(windowsDirectory.isDirectory()); String
		 * content[]=windowsDirectory.list(); for (String s:content) {
		 * System.out.println(s); }
		 */
	
	File newDir=new File("myDir");
	if(!newDir.exists()) {
		newDir.mkdir();
	}
	
	File file=new File(newDir,"myFile.txt");
	if(!(file.exists())){
			file.createNewFile();
	}
}
}