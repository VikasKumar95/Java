package com.qualde;
public class Test13{
	public static void main(String[] args) throws InterruptedException {	
		System.out.println("main method() started");
		Demo d=new Demo();
		Runnable r=d::say;
		Thread th=new Thread(r);
		th.start();

		Thread.sleep(1);
		
	System.out.println("main method() end");
	}
}

class Demo{
	public void say() {
		for(int i=0;i<6;i++)
		System.out.println("sayHello() method "+i);
	}
}


