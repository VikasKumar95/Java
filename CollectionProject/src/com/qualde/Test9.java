package com.qualde;
import java.util.*;
public class Test9 {	
	public static void main(String[] args) {	
	Vector<String> flowers=new Vector<>();
	//to ensure minimum capacity
	flowers.ensureCapacity(20);
	System.out.println(flowers.capacity());	
	flowers.add("Lily");
	flowers.add("Rose");
	flowers.add("Jasmine");
	flowers.add(2,"Dahlia");
	System.out.println(flowers);
	
	//to find the index of element
	System.out.println("index="+flowers.indexOf("Rose"));
	System.out.println(flowers.contains("Jasmine"));
	System.out.println(flowers.set(1,"Lotus"));
	System.out.println(flowers);
	
	System.out.println(flowers.get(1));
	}
}
