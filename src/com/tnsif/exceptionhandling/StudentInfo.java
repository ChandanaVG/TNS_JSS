package com.tnsif.exceptionhandling;

public class StudentInfo {
	
	private int rollNo;
	private String name;
	private float perc;
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPerc() {
		return perc;
	}
	public void setPerc(float perc) {
		this.perc = perc;
	}
	
	public void show() {
		try {
			PercentageValidator.isValidPercentage(perc);
			System.out.println("Student details");
			System.out.println("Name:"+ name+" Roll number:" + rollNo + " Percentage:"+perc );
		}
		catch(ArithmeticException e) {
			System.out.println("Invalid percentage");
			System.out.println(e.getMessage());
		}
	}
}
