package com.example.tddCoursework.productionCode;

import java.util.ArrayList;
import java.util.List;

public class RecordManager {
	
		
	private List<Student> studentList;
		
	public RecordManager(Student s) {
		
		this.studentList = new ArrayList<Student>();
		
		this.studentList.add(s);
		
	}

	public void addStudent(Student s){
		
		this.studentList.add(s);
		
		
	}

	public List<Student> retrieveStudents(){
		
		return this.studentList;
	
	}
	
	
	public Student getStudent(int id) {
		return this.studentList.get(id);
		
		
	}
	
	public List<Student> searchMatchingNames(String name){
		List<Student> l;
		l = new ArrayList<Student>();
		
		for(int i = 0; i < this.studentList.size(); i++) {
			if (this.studentList.get(i).getName() == name) {
				l.add(this.studentList.get(i));
				
			}
			
		}
		
		
		if (l.isEmpty()) {return null;}
		
		return l;
	}
	
	public void changeName(Student s, String newName){
		
		s.setName(newName);
		
	}
	
	public void changeAddress(Student s, String newAddress){
		
		s.setAddress(newAddress);
		
	}
	
	public void addModule(Module mToAdd, int id){
		boolean isDuplicate = false;
		Student s = this.studentList.get(id);
		for (int i = 0;i<s.getModuleList().size();i++){
			if (s.getModuleList().get(i).getCode() == mToAdd.getCode()){
				isDuplicate = true;
			}
			
			
		}

		if (!isDuplicate){
			s.getModuleList().add(mToAdd);
		}	
		
	}
	
	public double calcAverageMark(int id){
		int average = 0;
		int count = 0;
		for(Module module : this.studentList.get(id).getModuleList()){
			average = average + module.getMark();
			count++;
		}
		return average/count;
	}
	 
} 
  
	
	


