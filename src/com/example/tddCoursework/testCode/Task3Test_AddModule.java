package com.example.tddCoursework.testCode;

import static org.junit.Assert.*;

import java.awt.image.RasterFormatException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.example.tddCoursework.productionCode.Module;
import com.example.tddCoursework.productionCode.RecordManager;
import com.example.tddCoursework.productionCode.Student;

public class Task3Test_AddModule extends AbstractLoggingJUnitTest {
	
	
	
	@Test
	public void TestAddModule() {
		
		//Set moduleToAdd
		Module moduleToAdd = new Module("Networking", "CSC2033" , 5, 95);
		
		//Create modules and add to students
		List<Module> mL;
		mL = new ArrayList<Module>();
		
		
		mL.add(new Module("Algorithms", "CSC2025" , 5, 95));
		mL.add(new Module("Operating Systems", "CSC2024" , 5, 12));
		mL.add(new Module("Web", "CSC2045" , 5, 55));
		
		Student a = new Student("Name1", "Address1", "Email1", "Degree1", "dateEnrolled1",mL);
		Student b = new Student("Name2", "Address2", "Email2", "Degree2", "dateEnrolled2",mL);
		Student c = new Student("Name3", "Address3", "Email3", "Degree3", "dateEnrolled3",mL);
	
		//Add the students {a,b,c} to recordManager
		RecordManager rM = new RecordManager(a);
		rM.addStudent(b);
		rM.addStudent(c);
		
		//Attempt to add module to student id == 1
		rM.addModule(moduleToAdd, 1);
		
		//get the expected output
		assertEquals(rM.retrieveStudents().get(2).getModuleList().get(3), moduleToAdd);
	}
	
	@Test
	public void TestAddMolule_IgnoreDuplicates(){
		
		List<Module> mL;
		mL = new ArrayList<Module>();
		
		mL.add(new Module("Algorithms", "CSC2025" , 45, 10));
		mL.add(new Module("Operating Systems", "CSC2024" , 5, 10));
		mL.add(new Module("Web", "CSC2045" , 15, 55));
		
		//Attempt to add a module that already exists, with a different marks
		//We can then compare marks to ensure that the module isn't overridden/changed.
		Module moduleToAdd = new Module("Web", "CSC2045" , 45, 10);
		
		Student a = new Student("Name1", "Address1", "Email1", "Degree1", "dateEnrolled1",mL);
		Student b = new Student("Name2", "Address2", "Email2", "Degree2", "dateEnrolled2",mL);
		Student c = new Student("Name3", "Address3", "Email3", "Degree3", "dateEnrolled3",mL);
		
		RecordManager rM = new RecordManager(a);
		rM.addStudent(b);
		rM.addStudent(c);
		
		rM.addModule(moduleToAdd, 1);
		
		//if marks == 55, then addModule hasn't done anything
		assertEquals(rM.retrieveStudents().get(2).getModuleList().get(2).getMark(), 15);
		
		
		
	}
}
