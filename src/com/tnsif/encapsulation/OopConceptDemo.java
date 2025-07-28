package com.tnsif.encapsulation;

public class OopConceptDemo {
	private int age;
	private String name;
	
	@Override
	public String toString() {
		return "OopConceptDemo [age=" + age + ", name=" + name + "]";
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
