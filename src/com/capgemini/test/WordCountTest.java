package com.capgemini.test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.file.WordCount;

public class WordCountTest {

	private WordCount wc;
	
	@Before
	public void setUp()
	{
		wc=new WordCount();
	}
	
	@Test
	public void testFileExists() {			
		assertTrue(wc.fileExists("C:\\Users\\amhatre\\Desktop\\abc.txt"));	
	}

	@Test
	public void testFileNotExists() {
		
		assertFalse(wc.fileExists("C:\\Users\\amhatre\\Desktop\\ab.txt"));
	}
	
	public void testFileIsEmpty() {
		assertTrue(wc.checkFileIsEmpty("C:\\Users\\amhatre\\Desktop\\hello.txt")); 
	}
		
	@Test
	public void testWordCount() throws IOException {
		wc=new WordCount();
		assertEquals(4,wc.wordCount("C:\\Users\\amhatre\\Desktop\\abc.txt"));
}
	
	
	
}