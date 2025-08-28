package com.tnsif.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.tnsif.array.Student;

public class ArrayListDemo {

	public static void main(String[] args) {
		List al = new ArrayList ();
		al.add(10);
		al.add(new Integer(10));
		al.add("Chandana");
		Student s1 = new Student(1, "Bob");
		al.add(s1);
		al.add(new Student());
		System.out.println(al);
		
		Iterator i = al.iterator();
		while(i.hasNext()) {
			Object obj = i.next();
			System.out.println(obj);
		
		}
		System.out.println(al.size());
		al.add(0, 5);
		System.out.println(al);
		al.remove(0);
		System.out.println(al);
	}

}
