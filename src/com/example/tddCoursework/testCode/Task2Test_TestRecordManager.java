package com.example.tddCoursework.testCode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.example.tddCoursework.productionCode.RecordManager;
import com.example.tddCoursework.productionCode.Student;

public class Task2Test_TestRecordManager {
	
	@Test
	public void TestCreateMultipleRecordManagers(){
		
		Student sa = new Student("Name", "Address", "Email", "Degree", "dateEnrolled",null);
		Student sb = new Student("Name", "Address", "Email", "Degree", "dateEnrolled",null);
		
		RecordManager rM1 = new RecordManager(sa);
		RecordManager rM2 = new RecordManager(sb);
		
		assertEquals(rM1 instanceof RecordManager, true);
		assertEquals(rM2 instanceof RecordManager, true);
		
	}
	
	@Test
	public void TestStoringStudentInRecordManager() {
		
		Student store = new Student("Name", "Address", "Email", "Degree", "dateEnrolled",null);
		
		RecordManager rM = new RecordManager(store);
		
		assertEquals(store, rM.getStudent(0));
		
	}
	
	@Test 
	public void TestAddStudentToRecordManager() {
		
		Student store1 = new Student("Name", "Address", "Email", "Degree", "dateEnrolled",null);
		Student store2 = new Student("Name", "Address", "Email", "Degree", "dateEnrolled",null);
		
		
		RecordManager rM = new RecordManager(store1);
		rM.addStudent(store2);
		rM.addStudent(store1);
		
		assertEquals(rM.retrieveStudents().size(),3);
		
		assertEquals(rM.retrieveStudents().get(0), store1);
		assertEquals(rM.retrieveStudents().get(1), store2);
		assertEquals(rM.retrieveStudents().get(2), store1);
		
	}
	
	

}
