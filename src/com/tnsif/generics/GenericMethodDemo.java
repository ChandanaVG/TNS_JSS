package com.tnsif.generics;

import com.tnsif.inheritance.Citizen;

public class GenericMethodDemo {

	public static void main(String[] args) {
		
		GenericMethod obj = new GenericMethod();
		
		Integer[] intarray = {10, 20, 30, 40};
		
		String[] str = {"java", "programming", "learning"};
		
		Citizen[] c = {new Citizen("Chandana", "Blore", 234567890, 4567890)};
		
		obj.displayArrayElements(intarray);
		
		obj.displayArrayElements(str);
		
		obj.displayArrayElements(c);

	}

}
