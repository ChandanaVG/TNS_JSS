package com.tnsif.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		Queue<String> pq = new PriorityQueue<>();
		
		pq.add("Core java");
		pq.add("React");
		pq.add("HTML");
		pq.add("Angular");
		
		System.out.println(pq);
		
		Queue<Integer> pq1 = new PriorityQueue<>();//elements are stored in the natural ordering, smallest number has the highest priority
		
		pq1.add(67);
		pq1.add(1);
		pq1.add(45);
		pq1.add(90);
		
		System.out.println(pq1);
		
		pq1.remove();
		System.out.println(pq1);
		
	}

}
