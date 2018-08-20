package com.qualde;
public class Test8 implements Interface2 {
	
	public static void main(String[] args) {		
		Test8 t=new Test8();
		t.hello("Hi");;
	}
}

interface Interface2{
	default void hello(String str) {
		System.out.println("-- interface2 -->> "+str);	
	}
}

