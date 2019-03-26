package com.capgemini.file;

import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {

	public int wordCount(String string) throws IOException {
		int count=0;
		BufferedReader reader;
		reader=new BufferedReader(new FileReader(string));
		String line;
		while((line=reader.readLine())!=null){
			if(!(line.equals(""))){
				String[] wordcount=line.split("\\s+");
				count+=wordcount.length;
			}
		}
		reader.close();
		return count;
		
	}
	
	public boolean fileExists(String s) {
		File file=new File(s);
		return file.exists();
	}
	
	public boolean checkFileIsEmpty(String s) {
		File file=new File(s);
		if(file.length()==0)
			return false;
		return true;
	}
	
	

}
