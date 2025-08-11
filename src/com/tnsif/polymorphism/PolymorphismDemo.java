package com.tnsif.polymorphism;

public class PolymorphismDemo {

	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();
		int result = c1.add(c1.getNumOne(), c1.getNumTwo());
		System.out.println(result);
		
		Calculator c2 = new Calculator(5, 7);
		int result1 = c2.add(c2.getNumOne(), c2.getNumTwo());
		System.out.println(result1);
		
		Calculator c3 = new Calculator(8, 9.44f, 8.45f);
		int result2 = c3.add(c3.getNumThree(), c2.getNumTwo(), c3.getNumFive() );
		System.out.println(result2);
		
	}

}

