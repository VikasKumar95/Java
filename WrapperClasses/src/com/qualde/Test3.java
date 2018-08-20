package com.qualde;
public class Test3 {
	public static void main(String[] args) {		
		Short s1=Short.valueOf("20");
		Byte b1=Byte.valueOf("30");
		Integer i1=Integer.valueOf("234");
		Long l1=Long.valueOf("5893");
		
		System.out.println("s1="+s1+" b1="+b1+" i1="+i1+" l1="+l1);
		
		Float f1=Float.valueOf("34.6");
		Float f2=Float.valueOf("30.15f");
		Double d1=Double.valueOf("256.02");
		
		Boolean b2=Boolean.valueOf("TrUe");
		Boolean b3=Boolean.valueOf("abc");
		
		// Character c=Character.valueOf("s"); //compile time error
		
		System.out.println("f1="+f1+" f2="+f2+" d1="+d1+" b2="+b2+" b3="+b3);	
	}
}
