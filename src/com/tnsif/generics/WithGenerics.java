package com.tnsif.generics;

import java.util.ArrayList;

public class WithGenerics {

public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Java");
		//al.add(123); compile time error
		
		for(Object object:al) {
			System.out.println(object);
		}

	}
}
