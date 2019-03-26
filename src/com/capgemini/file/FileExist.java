package com.capgemini.file;

import java.io.File;

public class FileExist {
	
	public boolean fileExists(String s) {
		File file=new File(s);
		return file.exists();
	}
}
