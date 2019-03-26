package com.capgemini.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

//import static org.junit.Assert.*;

import org.junit.Test;

import com.capgemini.file.FileExist;

public class FileExistsTest {
	FileExist file=new FileExist();
	
	@Test
	public void testFileExists() {		
		assertTrue(file.fileExists("C:\\Anushree\\core java\\basic java\\src\\Armstrong.java"));
	}

	@Test
	public void testFileNotExists() {
		assertFalse(file.fileExists("C:\\Anushree\\core java\\basic java\\src\\Armstron.java"));
	}
}
