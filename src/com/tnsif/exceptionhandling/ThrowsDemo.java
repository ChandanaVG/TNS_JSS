package com.tnsif.exceptionhandling;

public class ThrowsDemo {

	public static void main(String[] args) {
		
		StudentInfo s1 = new StudentInfo();
		s1.setName("Chandana");
		s1.setRollNo(36);
		s1.setPerc(98);
		s1.show();

		StudentInfo s2 = new StudentInfo();
		s2.setName("abc");
		s2.setRollNo(3);
		s2.setPerc(-1);
		s2.show();
		
		VoterInfo v1 = new VoterInfo();
		v1.setName("Rahul");
		v1.setAge(11);
		System.out.println(v1);
		
		VoterInfo v2 = new VoterInfo();
		v2.setName("Chandana");
		v2.setAge(20);
		System.out.println(v2);
		
	}

}
