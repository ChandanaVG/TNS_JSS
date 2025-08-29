package com.tnsif.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class ComparableDemo {

	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(1, "Geetha", 66.45f));
		al.add(new Student(34, "ALex", 88.45f));
		al.add(new Student(87, "Bob", 56.45f));
		al.add(new Student(2, "Max", 60.45f));
		
		Comparator<Student> comp = (s2,s1) -> (int) (s1.getPer() - s2.getPer());
		
		System.out.println(al);
		
		al.sort(comp);
		
		System.out.println(al);
		
		Iterator i = al.iterator();
		while(i.hasNext()) {
			Object obj = i.next();
			System.out.println(obj);
		}
}
}
