package com.example.tddCoursework.testCode;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.ExtendedSSLSession;

import org.junit.Test;

import com.example.tddCoursework.productionCode.Module;
import com.example.tddCoursework.productionCode.RecordManager;
import com.example.tddCoursework.productionCode.Student;

public class Task3Test_CalcAverageMark extends AbstractLoggingJUnitTest {
	
	@Test
	public void TestCalcAverageMark_MultipleModules(){
		
		//Create student with 3 modules, marks 60,30 and 55
		List<Module> mL;
		mL = new ArrayList<Module>();
		
		mL.add(new Module("Algorithms", "CSC2025" , 60, 20));
		mL.add(new Module("Operating Systems", "CSC2024" , 30, 10));
		mL.add(new Module("Web", "CSC2045" , 55, 10));
		
		Student a = new Student("Name1", "Address1", "Email1", "Degree1", "dateEnrolled1", mL);
		Student b = new Student("Name2", "Address2", "Email2", "Degree2", "dateEnrolled2", mL);
		Student c = new Student("Name3", "Address3", "Email3", "Degree3", "dateEnrolled3", mL);
		
		//Add students to RecordManager
		RecordManager rM = new RecordManager(a);
		rM.addStudent(b);
		rM.addStudent(c);
		
		//Set expected output and actual
		int id = 2;
		double averageMark = rM.calcAverageMark(id);
		double expectedAverageMark = (60 + 30 + 55)/3;
		
		//Compare the two, assert equals, tolerance of 0.01 
		assertEquals(expectedAverageMark, averageMark, 0.01);
		
		
	}
	
	@Test
	public void TestCalcAverageMark_SingleModule(){
		
		//Create student with 3 modules, marks 60,30 and 55
		List<Module> mL;
		mL = new ArrayList<Module>();
		
		mL.add(new Module("Algorithms", "CSC2025" , 60, 20));
		
		Student a = new Student("Name1", "Address1", "Email1", "Degree1", "dateEnrolled1", mL);
		Student b = new Student("Name2", "Address2", "Email2", "Degree2", "dateEnrolled2", mL);
		Student c = new Student("Name3", "Address3", "Email3", "Degree3", "dateEnrolled3", mL);
	
		//Add students to RecordManager
		RecordManager rM = new RecordManager(a);
		rM.addStudent(b);
		rM.addStudent(c);
		
		//Set expected output and actual
		int id = 0;
		double averageMark = rM.calcAverageMark(id);
		double expectedAverageMark = 60;
		
		//Compare the two, assert equals, tolerance of 0.01 
		assertEquals(expectedAverageMark, averageMark, 0.01);
		
		
	}
	

}
