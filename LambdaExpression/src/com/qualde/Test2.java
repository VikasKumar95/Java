package com.qualde;
public class Test2 {
	public static void main(String[] args) {		
		
		//using lambda expression
		Interface11 m1=(int x, int y)->(x+y);	
		Interface11 m2=(x,y)->{return(x+y);};	
		Interface11 m3=(x,y)->(x+y);	
		System.out.println(m1.sum(25,76));
		System.out.println(m2.sum(25,76));
		System.out.println(m3.sum(25,76));
		
	}
}

interface Interface11{

	int sum(int a, int b);
		
}
