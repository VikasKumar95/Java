package com.qualde;
public class Test4 {
	public static void main(String[] args) {		
		Short s1=Short.valueOf("1101",2);
		Byte b1=Byte.valueOf("36",8);
		Integer i1=Integer.valueOf("24A1",16);
		Long l1=Long.valueOf("58A9X3",36);
		//Long l2=Long.valueOf("58A9X3",37); max radix limit is 36
		
		System.out.println("s1="+s1+" b1="+b1+" i1="+i1+" l1="+l1);	
	}
}
