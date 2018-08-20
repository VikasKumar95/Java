package com.qualde;
import java.util.*;
public class Test3 {
	public static void main(String[] args) {		
		
		List<Integer> list=new ArrayList<>();
		list.add(500);
		list.add(10);
		list.add(3000);
		list.add(450);
		
		list.forEach(num->System.out.println(num));		
	}
}


