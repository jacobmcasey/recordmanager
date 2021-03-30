package com.example.tddCoursework.testCode;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.example.tddCoursework.productionCode.RecordManager;
import com.example.tddCoursework.productionCode.Student;

public class Task2Test_TestSearchNames{ 


@Test
public void TestSearchNames_NoMatchesExist() {
	
	
	//Create Students
	Student a = new Student("Different Name1", "Address1", "Email1", "Degree1", "dateEnrolled1",null);
	Student b = new Student("Different Name2", "Address2", "Email2", "Degree2", "dateEnrolled2",null);
	Student c = new Student("Different Name3", "Address3", "Email3", "Degree3", "dateEnrolled3",null);
	Student d = new Student("Different Name4", "Address4", "Email4", "Degree4", "dateEnrolled4",null);
			
	//Add all the Students to a RecordManager
	RecordManager rM = new RecordManager(a);
	rM.addStudent(b);
	rM.addStudent(c);
	rM.addStudent(d);
	
	//Search for a name that doesn't exist 	
	assertEquals(rM.searchMatchingNames("Different Name5"),null);
	
	
	
}   

@Test
public void TestSearchNames_oneMatch() {
	
	//Create Students
	Student a = new Student("Different Name1", "Address1", "Email1", "Degree1", "dateEnrolled1",null);
	Student b = new Student("Different Name2", "Address2", "Email2", "Degree2", "dateEnrolled2",null);
	Student c = new Student("Different Name3", "Address3", "Email3", "Degree3", "dateEnrolled3",null);
	Student d = new Student("Different Name4", "Address4", "Email4", "Degree4", "dateEnrolled4",null);
			
	//Add all the Students to a RecordManager
	RecordManager rM = new RecordManager(a);
	rM.addStudent(b);
	rM.addStudent(c);
	rM.addStudent(d);
	
	//Init a new arrlist of Students to compare what searchMatchingName(String name) returns
	List<Student> cmpList = new ArrayList<Student>();
	//add expected output to the cmpList
	cmpList.add(a);

	//Search ListofStudents for Different Name1(student named a), assertEquals with cmpList(expected value)
	assertEquals(rM.searchMatchingNames("Different Name1"),cmpList);
	
	
	
}

@Test
public void TestSearchNames_twoMatches() {
	
	//Create Students
	Student a = new Student("Same Name", "Address1", "Email1", "Degree1", "dateEnrolled1",null);
	Student b = new Student("Same Name", "Address2", "Email2", "Degree2", "dateEnrolled2",null);
	Student c = new Student("Different Name3", "Address3", "Email3", "Degree3", "dateEnrolled3",null);
	Student d = new Student("Different Name4", "Address4", "Email4", "Degree4", "dateEnrolled4",null);
			
	//Add all the Students to a RecordManager
	RecordManager rM = new RecordManager(a);
	rM.addStudent(b);
	rM.addStudent(c);
	rM.addStudent(d);

	//Init a new arrlist of Students to compare what searchMatchingName(String name) returns
	List<Student> cmpList = new ArrayList<Student>();
	//add expected output to the cmpList
	cmpList.add(a);
	cmpList.add(b);

	//Search ListofStudents for Same Name(student named {a, b}), assertEquals with cmpList(expected value)
	assertEquals(rM.searchMatchingNames("Same Name"),cmpList);
	
	
	
}

@Test
public void TestSearchNames_multipleMatches() {
	
	//Create Students
	Student a = new Student("Same Name", "Address1", "Email1", "Degree1", "dateEnrolled1",null);
	Student b = new Student("Same Name", "Address2", "Email2", "Degree2", "dateEnrolled2",null);
	Student c = new Student("Same Name", "Address3", "Email3", "Degree3", "dateEnrolled3",null);
	Student d = new Student("Different Name4", "Address4", "Email4", "Degree4", "dateEnrolled4",null);
	Student e = new Student("Same Name", "Address5", "Email5", "Degree5", "dateEnrolled5",null);
			
	//Add all the Students to a RecordManager
	RecordManager rM = new RecordManager(a);
	rM.addStudent(b);
	rM.addStudent(c);
	rM.addStudent(d);
	rM.addStudent(e);

	//Init a new arrlist of Students to compare what searchMatchingName(String name) returns
	List<Student> cmpList = new ArrayList<Student>();
	//add expected output to the cmpList
	cmpList.add(a);
	cmpList.add(b);
	cmpList.add(c);
	cmpList.add(e);
	

	//Search ListofStudents for Same Name(student named {a,b,c,e}), assertEquals with cmpList(expected value)
	assertEquals(rM.searchMatchingNames("Same Name"),cmpList);
	
	
}


}
