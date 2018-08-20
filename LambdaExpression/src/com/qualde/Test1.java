package com.qualde;

public class Test1 {

	public static void main(String[] args) {
		
		//using anonymous class
		MyInterface m=new MyInterface() {
			
			public void show() {
				System.out.println("welcome to show() method");
			}		
		};
		m.show();
		
		//using lambda expression
		MyInterface m1=()->{System.out.println("hello this is lambda expression");};	
		m1.show();
	}
}

@FunctionalInterface
interface MyInterface{
	void show();
	
}
