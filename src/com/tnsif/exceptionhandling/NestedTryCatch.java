package com.tnsif.exceptionhandling;

public class NestedTryCatch {

	public static void check() {
		String str = "TNSIF";
		int slength = str.length();
		System.out.println("The length of the string is " + slength);
		String anotherString = null;
		int y = 4;
		
		try {
			try {
				System.out.println(str.charAt(y));
			}
			catch(StringIndexOutOfBoundsException se) {
				System.err.println("index is out of bounds" + se.getMessage());
			}
			try {
				System.out.println("The length of the another string is" + anotherString.length());
			}
			catch(NullPointerException ne) {
				System.out.println(ne.getMessage());
			}
		}
		catch(Exception e) {
			
		}
	}
}
