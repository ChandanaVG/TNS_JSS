package com.tnsif.hybrid;

public class Employee extends Person {
	String company;

	public Employee(String company) {
		this.company = company;
	}

	public Employee(String name, String company) {
		super(name);
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
		return "Employee [company=" + company + ", Name=" + getName() + "]";
	}	
	
}
