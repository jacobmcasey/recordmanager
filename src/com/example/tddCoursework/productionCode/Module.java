package com.example.tddCoursework.productionCode;

public class Module {
	
	private String title, code;
	private int mark, credits;
	
	public Module(String title, String code, int mark, int credits) {
		
		this.setTitle(title);
		this.setCode(code);
		this.setMark(mark);
		this.setCredits(credits);
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}
	
//	@Override
//	public String toString() {
//		return String.format("Credits: " + this.getCredits());
//	}
	
	
	

}
