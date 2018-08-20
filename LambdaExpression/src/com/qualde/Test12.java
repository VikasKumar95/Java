package com.qualde;
public class Test12{
	public static void main(String[] args) {	
		System.out.println("main method() started");
		
		Runnable r=Hello::sayHello;
		Thread th=new Thread(r);
		th.start();
		
	System.out.println("main method() end");
	}
}

class Hello{
	public static void sayHello() {
		System.out.println("sayHello() method");
	}
	public static void sayBye(String str) {
		System.out.println("sayBye() method"+str);
	}
}


