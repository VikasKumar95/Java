package com.qualde;
public class Test10 extends A implements Interface5{
	public static void main(String[] args) {		
		Test10 t=new Test10();
		t.hello("Hi");		
	}
}

class A{	
	public  void hello(String str) {
		System.out.println("-- A hello() method -->> "+str);			
	}
}

interface Interface5{
	default void hello(String str) {
		System.out.println("-- interface5 hello() method -->> "+str);			
	}	
}

