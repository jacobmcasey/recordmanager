package com.example.tddCoursework.testCode;

import static org.junit.Assert.*;

import org.junit.Test;

import com.example.tddCoursework.productionCode.RecordManager;
import com.example.tddCoursework.productionCode.Student;
import com.example.tddCoursework.productionCode.Module;

public class Task3Test_TestChangeNameAndAddress extends AbstractLoggingJUnitTest {
	
	@Test
	public void TestChangeName() {
		
		//Create Student
		Student s = new Student("Jack", "Address1", "Email1", "Degree1", "dateEnrolled1",null);
		
		//Create RecordManager and add the Student s
		RecordManager rM = new RecordManager(s);
		
		//Call changeName(Student s, String newName)
		//This should change name of s to Jacob from Jack
		rM.changeName(s,"Jacob");
		
		
		//Get the name of the student after calling changeName(Student s, String newName)
		//It should be Jacob, Compare, assertEquals
		assertEquals(rM.retrieveStudents().get(0).getName(),"Jacob");
	}
	
	@Test
	public void TestChangeAddress(){
		
		//Create Student
		Student s = new Student("Jack", "Old Address", "Email1", "Degree1", "dateEnrolled1",null);
		
		//Create RecordManager and add the Student s
		RecordManager rM = new RecordManager(s);
		
		//Call changeAddress(Student s, String newAddress)
		//This should change name of s to "A new Address" from "Old Address"
		rM.changeAddress(s,"A new address");
		
		//Get the address of the student after calling changeName(Student s, String newAddress)
		//It should be "A new Address", Compare, assertEquals
		assertEquals(rM.retrieveStudents().get(0).getAddress(),"A new address");
		
		
		
	}

}
