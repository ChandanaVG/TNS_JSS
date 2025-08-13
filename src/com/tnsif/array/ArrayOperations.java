package com.tnsif.array;

import java.util.Scanner;

public class ArrayOperations {
	
	static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) 
				System.out.print(arr[i]+" ");
			System.out.println();
	}
	
	void addElements(int[] arr) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array elements");
		for(int i=0;i<arr.length;i++)
				arr[i] = sc.nextInt();
		sc.close();
	}
	
	public static int getOddCount(int b[]) {
		int count = 0;
		for(int i=0;i<b.length;i++) {
			if(b[i]%2 != 0)
				count++;
		}
		return count;
	}
	
	public static int getEvenCount(int b[]) {
		int count=0;
		for(int i=0;i<b.length;i++) {
			if(b[i]%2 == 0)
				count++;
		}
		return count;
	}
}
