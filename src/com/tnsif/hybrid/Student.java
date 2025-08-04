package com.tnsif.hybrid;

public class Student extends Person{
	String school;

	public Student(String school) {
		this.school = school;
	}
	
	public Student(String name, String school) {
		super(name);
		this.school = school;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	@Override
	public String toString() {
		return "Student [school=" + school + ", Name=" + getName() + "]";
	}
	
	
}
