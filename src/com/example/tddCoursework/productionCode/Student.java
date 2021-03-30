package com.example.tddCoursework.productionCode;

import java.util.List;
import java.util.function.ToDoubleBiFunction;

public class Student {
	
	int id = 0;
	private static int counter = 0;
	private String name, address, email, degree, dateEnrolled;
	private List<Module> moduleList;
	
	
	
	public Student(String name, String address ,String email,String degree, String dateEnrolled, List<Module> moduleList) {
		this.id = ++counter;
		
		
		
		this.setName(name);
		this.setAddress(address);
		this.setEmail(email);
		this.setDegree(degree);
		
		this.dateEnrolled = dateEnrolled;
		
		this.moduleList = moduleList;
		
		
	}
	
	public int getId() {
		
		return this.id;
		
	}

	public String getDateEnrolled() {
		return dateEnrolled;
	}

	public void setDateEnrolled(String dateEnrolled) {
		this.dateEnrolled = dateEnrolled;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public List<Module> getModuleList() {
		return moduleList;
	}

	public void setModuleList(List<Module> moduleList) {
		this.moduleList = moduleList;
	}
	
	
}



