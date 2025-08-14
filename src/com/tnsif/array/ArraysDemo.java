package com.tnsif.array;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		
		int intArr[] = {10, 20, 15, 22, 35, 18, 14};
		
		System.out.println("Array elements are "+Arrays.toString(intArr));
		Arrays.sort(intArr);
		System.out.println("Array elements are "+Arrays.toString(intArr));
		
		int keyValue = 22;
		System.out.println(keyValue+" "+"found at "+Arrays.binarySearch(intArr, keyValue));
	}

}
