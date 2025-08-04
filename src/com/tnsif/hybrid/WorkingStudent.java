package com.tnsif.hybrid;

public class WorkingStudent extends Student {
	String company;

	public WorkingStudent(String name, String school, String company) {
		super(name, school);
		this.company = company;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "WorkingStudent [company=" + company + ", School=" + getSchool() + ", Name=" + getName() + "]";
	}
	
}
