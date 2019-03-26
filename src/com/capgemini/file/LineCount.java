package com.capgemini.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LineCount {
	
	public int lineCount(String s) throws IOException {
		int count=0;
		BufferedReader reader;
		reader=new BufferedReader(new FileReader(s));
		String line=reader.readLine();
		while(line!=null)
		{
			System.out.println(line);
			line=reader.readLine();
			count++;
		
		}
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
