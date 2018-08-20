package com.qualde;
public class Test1 {
	public static void main(String[] args) {
		
		Integer i1=new Integer(250);//boxing
		System.out.println(i1);
		
		Integer i2=new Integer("5000");
		System.out.println(i2);	
		
		Integer i3=Integer.valueOf(200);
		System.out.println(i3);
		
		Integer i4=Integer.valueOf("400");
		System.out.println(i4);	
		
		Boolean b1=new Boolean(true);//true
		Boolean b2=new Boolean("True");//true
		Boolean b3=new Boolean(false);//false
		Boolean b4=new Boolean("TrUe");//true
		Boolean b5=new Boolean("Ok");//false
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);	
	}
}
