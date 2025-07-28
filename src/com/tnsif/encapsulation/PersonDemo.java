package com.tnsif.encapsulation;
import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setAge(21);
		p1.setName("Chandana");
		p1.setGender("Female");
		p1.setIncome(100000);
		System.out.println(p1);
		
		Person p2 = new Person("Pragathi", 50000, "Female", 20);
		System.out.println(p2);
		
		Person p3 = new Person();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name of the person");
		p3.setName(sc.next());
		
		System.out.println("Enter the age of the person");
		p3.setAge(sc.nextInt());
		
		System.out.println("Enter the salary of the person");
		p3.setIncome(sc.nextInt());
		
		System.out.println("Enter the gender of the person");
		p3.setGender(sc.next());
		
		System.out.println(p3);
	}

}
