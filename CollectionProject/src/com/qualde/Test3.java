package com.qualde;
import java.util.*;
public class Test3 {	
	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(10);
		v.add("hello");
		v.add('A');
		v.add(34.78);
		v.add("English");
		Enumeration en=v.elements();
		while(en.hasMoreElements()){
			System.out.println(en.nextElement());		
		}
	}
}
