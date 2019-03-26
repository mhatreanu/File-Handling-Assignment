package com.capgemini.model;

import java.util.function.BooleanSupplier;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmployeeSerialize {

	public Boolean writeObjectToFile(String fileName, Object obj) throws IOException {
		
		FileOutputStream fileOutputStream = new FileOutputStream(fileName);
		ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
		
		outputStream.writeObject(obj);
		outputStream.close();
			
		return true;
	}

}
