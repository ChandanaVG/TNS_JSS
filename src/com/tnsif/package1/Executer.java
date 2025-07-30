package com.tnsif.package1;

public class Executer {

	public static void main(String[] args) {
		
		Base b = new Base();
		b.varDefault=12;
		b.varProtected=20;
		b.varPublic=30;
		b.methodDefault();
		b.methodProtected();
		b.methodPublic();
	}
}
