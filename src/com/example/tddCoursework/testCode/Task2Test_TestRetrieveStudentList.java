package com.example.tddCoursework.testCode;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.example.tddCoursework.productionCode.Module;
import com.example.tddCoursework.productionCode.RecordManager;
import com.example.tddCoursework.productionCode.Student;

public class Task2Test_TestRetrieveStudentList {
	
	@Test
	public void TestRetrievingStudentList_Successful() {
		

		//Create Students
		List<Module> mL;
		mL = new ArrayList<Module>();
		
		mL.add(new Module("Algorithms", "CSC2025" , 5, 95));
		mL.add(new Module("Operating Systems", "CSC2024" , 5, 12));
		mL.add(new Module("Web", "CSC2045" , 5, 55));
		
		Student a = new Student("Name1", "Address1", "Email1", "Degree1", "dateEnrolled1",mL);
		Student b = new Student("Name2", "Address2", "Email2", "Degree2", "dateEnrolled2",mL);
		Student c = new Student("Name3", "Address3", "Email3", "Degree3", "dateEnrolled3",mL);
				
		//Add students to new RecordManager
		RecordManager rM = new RecordManager(a);
		rM.addStudent(b);
		rM.addStudent(c);
		
		//Create new list of students with expected return value
		List<Student> cmpList = new ArrayList<Student>();
		cmpList.add(a);
		cmpList.add(b);
		cmpList.add(c);

		//Compare expexted list against given list
		assertEquals(cmpList,rM.retrieveStudents());


	}
	
	@Test
	public void TestRetrievingStudentList2_Unsuccessful() {
		
		//Create Students
		List<Module> mL;
		mL = new ArrayList<Module>();
		
		mL.add(new Module("Algorithms", "CSC2025" , 5, 95));
		mL.add(new Module("Operating Systems", "CSC2024" , 5, 12));
		mL.add(new Module("Web", "CSC2045" , 5, 55));
		
		Student a = new Student("Name1", "Address1", "Email1", "Degree1", "dateEnrolled1",mL);
		Student b = new Student("Name2", "Address2", "Email2", "Degree2", "dateEnrolled2",mL);
		Student c = new Student("Name3", "Address3", "Email3", "Degree3", "dateEnrolled3",mL);
				
		//Add students to new RecordManager
		RecordManager rM = new RecordManager(a);	// add a	
		rM.addStudent(b);							// add b
		rM.addStudent(c);							// add c
		
		//Create new list of students with expected return value
		List<Student> cmpList = new ArrayList<Student>();
		cmpList.add(a);								// add a
		cmpList.add(a);								// add a again
		cmpList.add(c);								// add c

		//Compare expexted list against given list
		assertNotEquals(cmpList,rM.retrieveStudents());

		
	}
	
	
	

}
