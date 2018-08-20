package com.qualde;
public class Test7 {
	public static void main(String[] args) {		
		I1.show();
		I1.hello("Welcome");
	}
}

interface I1{
	static void show() {
		System.out.println("this is static show() method inside interface");
		
	}
	
	static void hello(String str) {
		System.out.println("-- static hello() method inside interface -->> "+str);
		
	}
}
