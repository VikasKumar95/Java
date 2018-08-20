package com.qualde;
public class Test9 implements Interface3,Interface4 {
	
	public void hello(String str) {
		System.out.println("--- Test8 hello() method "+str);
	}
	public static void main(String[] args) {		
		Test9 t=new Test9();
		t.hello("Hi");
		t.display();
	}
}

interface Interface3{
	default void hello(String str) {
		System.out.println("-- interface3 hello() method -->> "+str);		
	}
	default void display() {
		System.out.println("-- interface3 display() method-->> ");		
	}	
}


interface Interface4{		
	default void hello(String str) {
		System.out.println("-- interface3 hello() method-->> "+str);	
	}
}