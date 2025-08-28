package com.tnsif.collections;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		
		System.out.println(ll);
		
		ListIterator li = ll.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		ll.add(0, 40);
		
		System.out.println(ll);
	}

}
