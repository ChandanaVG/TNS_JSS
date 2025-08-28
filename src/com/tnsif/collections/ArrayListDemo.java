package com.tnsif.collections;

import java.util.ArrayList;
import java.util.List;

import com.tnsif.array.Student;

public class ArrayListDemo {

	public static void main(String[] args) {
		List al = new ArrayList ();
		al.add(10);
		al.add(new Integer(10));
		al.add("Chandana)");
		al.add(new Student());
		System.out.println(al);
		System.out.println(al.size());
		al.add(0, 5);
		System.out.println(al);
		al.remove(0);
		System.out.println(al);
	}

}
