package com.tnsif.array;

import java.util.Scanner;

public class ArrayOfObjectsDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student arr[];
		
		arr = new Student[5];
		
		Student s1 = new Student(1, "Chandana");
		arr[0] = s1;
		
		arr[1] = new Student(2, "Madhav");
		
		for(int i=2;i<arr.length;i++) {
			System.out.println("Enter the roll number of student");
			int rollNum = sc.nextInt();
			System.out.println("Enter the name");
			String name = sc.next();
			arr[i] = new Student(rollNum, name);
		}
		sc.close();
	}
}
