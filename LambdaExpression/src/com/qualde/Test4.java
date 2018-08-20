package com.qualde;

public class Test4 {
	public static void main(String[] args) {		
		Runnable r=new Runnable() {
			
			public void run() {
				System.out.println("------ run method() -----");
				for(int i=0;i<5;i++)
					System.out.println(i+" ="+Thread.currentThread().getName());
			}
		};
		Thread th=new Thread(r);
		
		
		
		Runnable r1=()->{
			System.out.println("----- this is lambda expression--------");
			for(int i=0;i<5;i++)
				System.out.println(i+" ="+Thread.currentThread().getName());
		};
		Thread th1=new Thread(r1);
		th1.start();
		th.start();

	}
}


