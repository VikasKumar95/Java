package com.qualde;
import java.util.*;
public class Test12 {	
	public static void main(String[] args) {
		LinkedHashSet<String> linkedHashset=new LinkedHashSet<>();
		linkedHashset.add("Anuj");
		linkedHashset.add("Sachin");
		linkedHashset.add("Rohan");
		linkedHashset.add("Rakesh");
		System.out.println(linkedHashset);
		
		//duplicate object does not store.
		boolean b=linkedHashset.add("Sachin");
		System.out.println(b);
		System.out.println(linkedHashset.contains("Rohan"));
		linkedHashset.remove("Rohan");
		System.out.println(linkedHashset.contains("Rohan"));
		System.out.println(linkedHashset);
		System.out.println("size="+linkedHashset.size());	
		System.out.println(linkedHashset.isEmpty());
	}
}
