package com.capgemini.model;

import java.io.Serializable;

public class Employee implements Serializable {
	
	private int employeeId;
	private  String employeeName;
	private double salary;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int employeeId, String employeeName, double salary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}

	

}
