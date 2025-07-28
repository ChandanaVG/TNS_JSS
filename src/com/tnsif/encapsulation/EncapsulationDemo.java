package com.tnsif.encapsulation;

public class EncapsulationDemo {
	
	 public static void main(String args[]) {
		 
		 OopConceptDemo obj = new OopConceptDemo();
		 obj.setAge(21);
		 obj.setName("Chandana");
		 System.out.println(obj.getAge());
		 System.out.println(obj);
		 
		 OopConceptDemo obj1 = new OopConceptDemo();
		 obj1.setAge(20);
		 obj1.setName("Pragathi");
		 System.out.println(obj1);
	 }
}
