package com.qualde;
public class Test5 {
	public static void main(String[] args) {
		short s=20;
		Short s1=Short.valueOf(s);
		byte b=110;
		Byte b1=Byte.valueOf(b);
		Integer i1=Integer.valueOf(345);
		Long l1=Long.valueOf(54573);
		
		System.out.println("s1="+s1+" b1="+b1+" i1="+i1+" l1="+l1);
		
		Float f1=Float.valueOf(34.6f);
	
		Double d1=Double.valueOf(256.02);
		
		Boolean b2=Boolean.valueOf(true);
		Boolean b3=Boolean.valueOf(false);
		
		 Character c=Character.valueOf('B');
		
		System.out.println("f1="+f1+" d1="+d1+" b2="+b2+" b3="+b3+" c="+c);	
	}
}
