package com.capgemini.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.capgemini.model.Employee;
import com.capgemini.model.EmployeeDeserialize;
import com.capgemini.model.EmployeeSerialize;

public class EmployeeTest {

	private Employee employee;
	private EmployeeSerialize employeeSerialize;
	private EmployeeDeserialize employeeDeserialize;
	
	@Test
	public void testEmployeeSerialization() throws IOException {
		
		employee = new Employee(1,"Anu",5000);
		employeeSerialize = new EmployeeSerialize();
		assertTrue(employeeSerialize.writeObjectToFile("employee.ser",employee));
	}

}
