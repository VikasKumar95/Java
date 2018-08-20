package com.qualde;
import java.util.*;
public class Test11 {	
	public static void main(String[] args) {
		Set<String> set=new HashSet<>();
		set.add("Qualde");
		set.add("IBM");
		set.add("TCS");
		set.add("CGI");
		System.out.println(set);
		
		//duplicate object does not store.
		boolean b=set.add("TCS");
		System.out.println(b);
		System.out.println(set.contains("IBM"));
		set.remove("IBM");
		System.out.println(set.contains("IBM"));
		System.out.println(set);
		System.out.println("size="+set.size());
		
		System.out.println(set.isEmpty());
	}
}
