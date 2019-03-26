package com.capgemini.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.file.Grep;

public class GrepTest {

	public Grep grep;

	@Before
	public void setUp() {
		grep = new Grep();
	}

	@Test
	public void testFileNotFound() {

		assertFalse(grep.fileExists("C:\\Anushree\\core java\\basic java\\src\\Armstron.java"));
	}

	@Test
	public void testFileIsEmpty() {

		assertFalse(grep.checkFileIsEmpty("C:\\Users\\amhatre\\Desktop\\hello.txt"));
	}

	@Test
	public void testStringExist() {

		assertEquals("1 2 4 ", grep.WordFoundInLine("C:\\Users\\amhatre\\Desktop\\Word.txt", "all"));
	}

	
	  @Test public void testStringNotExists() {
	  
	  assertEquals("",grep.WordFoundInLine("C:\\Users\\amhatre\\Desktop\\Word.txt",
	  "abc")); }
	 

}