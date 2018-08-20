package com.qualde;
import java.util.*;
public class Test13 {	
	public static void main(String[] args) {	
		TreeSet<Integer> t=new TreeSet<>();
		t.add(10);
		t.add(5);
		t.add(34);
		t.add(50);	
		//elements will store in ascending order
		System.out.println(t);
		t.remove(34);
		System.out.println("size="+t.size());
		System.out.println(t);	
	}
}
