package com.tnsif.scanner;
import java.util.Scanner;

public class InputDemo {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String n = sc.next();
		System.out.println("Enter your age");
		int age = sc.nextInt();
		System.out.println("Enter your phone number");
		long phno = sc.nextLong();
		System.out.println("Hello " + n);
		System.out.println("Age : "+age);
		System.out.println("Phone number : "+phno);
	}

}
