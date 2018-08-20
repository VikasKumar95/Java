package com.qualde;
import java.util.*;
public class Test2 {
	
	public static void main(String[] args) {
		Collection cl=new ArrayList();
		cl.add(10);
		cl.add("hello");
		cl.add('A');
		cl.add(34.78);
		cl.add("English");
	
	Iterator it=cl.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
