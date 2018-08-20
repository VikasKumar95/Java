package com.qualde;
public class Test2 {
	public static void main(String[] args) {
		
		Integer i1=2324;  // autoboxing	
		int n1=i1.intValue(); //unboxing	
		int n2=i1;	//auto-unboxing
		
		System.out.println(i1);
		System.out.println(n1);
		System.out.println(n2);	
		
		Boolean b=false;
		boolean b1=b.booleanValue();	
		boolean b2=b1;
		
		System.out.println(b);
		System.out.println(b1);
		System.out.println(b2);			
	}
}
