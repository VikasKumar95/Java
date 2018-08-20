package com.qualde;
import java.util.*;
public class Test14 {	
	public static void main(String[] args) {	
		TreeSet<Integer> t=new TreeSet<>(new MyComparator());
		t.add(10);
		t.add(5);
		t.add(34);
		t.add(50);			
		System.out.println(t);	
	}
}

class MyComparator implements Comparator<Integer>{
	public int compare(Integer ob1,Integer ob2){	
		return -(ob1-ob2);
	}
}
