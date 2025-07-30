package com.tnsif.package1;

public class Base {
	int varDefault=10;
	public int varPublic=20;
	private int varPrivate=30;
	protected int varProtected=40;
	
	void methodDefault() {
		System.out.println("Base class Default method");
		System.out.println("Default Variable :"+varDefault);
	}
	
	public void methodPublic() {
		System.out.println("Base class Public method");
		System.out.println("Public Variable :"+varPublic);
	}
	
	private void methodPrivate() {
		System.out.println("Base class Private method");
		System.out.println("Private Variable :"+varPrivate);
	}
	
	protected void methodProtected() {
		System.out.println("Base class Protected method");
		System.out.println("Protected Variable :"+varProtected);
	}
}
