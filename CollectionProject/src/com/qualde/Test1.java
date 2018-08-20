package com.qualde;
import java.util.*;
public class Test1 {
	
	public static void main(String[] args) {
		Collection cl=new ArrayList();
			cl.add(10);
			cl.add("hello");
			cl.add('A');
			cl.add(34.78);
		System.out.println(cl);
		Collection cl2=new ArrayList();
			cl2.add("English");
			cl2.add("Hindi");
			cl2.add("Maths");
		cl.addAll(cl2);	
		System.out.println(cl);
			cl.remove('A');
		System.out.println(cl);
			cl.removeAll(cl2);
		System.out.println(cl);
			cl.addAll(cl2);
		System.out.println(cl);
			cl.retainAll(cl2);
		System.out.println(cl);
			boolean b=cl.contains("Hindi");
		System.out.println(b);
			int size=cl.size();
		System.out.println("size="+size);
		
		System.out.println("isEmpty()-->"+cl.isEmpty());
			cl.clear();
		System.out.println("isEmpty()-->"+cl.isEmpty());
		
	}
}
