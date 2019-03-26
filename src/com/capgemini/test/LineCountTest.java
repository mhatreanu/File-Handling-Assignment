package com.capgemini.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.capgemini.file.LineCount;
import com.capgemini.file.WordCount;

class LineCountTest {

	LineCount lc;
	
	@Test
	public void testFileExists() {	
		lc=new LineCount();
		assertTrue(lc.fileExists("C:\\Users\\amhatre\\Desktop\\abc.txt"));
		
	}

	@Test
	public void testFileNotExists() {
		lc=new LineCount();
		assertFalse(lc.fileExists("C:\\Users\\amhatre\\Desktop\\ab.txt"));
	}
	
	public void testFileIsEmpty() {
		assertTrue(lc.checkFileIsEmpty("C:\\Users\\amhatre\\Desktop\\hello.txt")); 
	}
	
	@Test
	public void testLineCount() throws IOException {
		lc=new LineCount();
		assertEquals(37,lc.lineCount("C:\\Anushree\\core java\\basic java\\src\\Armstrong.java"));
	}
	
	@Test
	public void testZeroLineCount() throws IOException {
		lc=new LineCount();
		assertEquals(0,lc.lineCount("C:\\Users\\amhatre\\Desktop\\hello.txt"));
	}

	
}
