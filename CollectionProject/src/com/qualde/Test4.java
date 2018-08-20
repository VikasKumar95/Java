package com.qualde;
import java.util.*;
public class Test4 {	
	public static void main(String[] args) {		
		ArrayList<String> al=new ArrayList<>();
		al.add("sunday");
		al.add("Tuesday");
		al.add(1,"Monday"); //add element at 1st index
		System.out.println(al);
		ArrayList<String> al2=new ArrayList<>();
		al2.add("ABC");
		al2.add("Qualde");
		al.addAll(al2);
		System.out.println(al);
		al.addAll(2,al2);
		System.out.println(al);
		
		int i=al.indexOf("Tuesday");
		System.out.println("index="+i);
System.out.println("first index of 'ABC'="+al.indexOf("ABC"));
		i=al.lastIndexOf("ABC");
		System.out.println("last index of 'ABC'="+i);
		
	}
}
