package com.qualde;
public class Test14{
	public static void main(String[] args) throws InterruptedException {	
		System.out.println("main method() started");
		
		ExampleInterface ei=Example::new;
		ei.something();
		
	System.out.println("main method() end");
	}
}

class Example{
	public Example() {
		System.out.println("--->> this is Example() constructor");		
	}
}

interface ExampleInterface{	
	public void something();
}


