package com.tnsif.basics;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		int d = 0;
		int a[] = new int[d];
		System.out.println("Value of d is "+d);
		try {
			int x = 45/d;
			//a[5] = 30; only first exception will be thrown
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		try {
			a[5] = 30;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Can't assign a value as the index you mentioned is out of bound.");
		}
		finally {
			System.out.println("I'm in finally block");
		}
		System.out.println("Outside catch block");
	}

}
