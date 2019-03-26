package com.capgemini.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Grep {
	
	public String WordFoundInLine(String path,String str) {
		
	int count = 0,countBuffer=0,countLine=0;
    String lineNumber = "";
    BufferedReader br;
    String inputSearch =str;
    String line = "";

    try {
        br = new BufferedReader(new FileReader(path));
        try {
            while((line = br.readLine()) != null)
            {
                countLine++;
               
                String[] words = line.split(" ");

                for (String word : words) {
                  if (word.equals(inputSearch)) {
                    count++;
                    countBuffer++;
                  }
                }

                if(countBuffer > 0)
                {
                    countBuffer = 0;
                    lineNumber += countLine+" ";
                }

            }
            br.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    } catch (FileNotFoundException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }

  return lineNumber;
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


