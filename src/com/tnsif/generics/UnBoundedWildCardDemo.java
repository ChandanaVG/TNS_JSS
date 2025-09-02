package com.tnsif.generics;

import java.util.Arrays;
import java.util.List;

public class UnBoundedWildCardDemo {

	public static void main(String[] args) {
		
		List<Integer> intList = Arrays.asList(1, 2, 3);
		System.out.println("Display Integer values");
		UnBoundedWildCard.display(intList);
		
		List<String> strList = Arrays.asList("hi", "hello", "hru?");
		System.out.println("Display String values");
		UnBoundedWildCard.display(strList);
	}

}
