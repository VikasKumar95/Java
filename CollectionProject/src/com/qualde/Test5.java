package com.qualde;
import java.util.*;
public class Test5 {	
	public static void main(String[] args) {	
	Collection<Integer> cl=new ArrayList<>();		
	cl.add(12);
	cl.add(20);
	cl.add(34);
	cl.add(30);
	System.out.println(cl);
	
	//Object[] toArray() method
		Object ob[]=cl.toArray();
		for(Object o:ob)
			System.out.println((int)o);	
	System.out.println("----------------------");
		
	//<T> T[] toArray(T[] a) method 
		Integer a[]=cl.toArray(new Integer[0]);
		for(int item:a)
			System.out.println(item);	
	}
}
