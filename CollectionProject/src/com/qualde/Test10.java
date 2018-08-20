package com.qualde;
import java.util.*;
public class Test10 {	
	public static void main(String[] args) {	
	Stack<Integer> elements=new Stack<>();
	System.out.println(elements.empty());
	
	elements.push(20);
	elements.push(30);
	elements.push(40);
	elements.push(720);
	elements.push(210);
	elements.push(380);
	elements.push(207);
	elements.push(310);
	System.out.println(elements);
	
	System.out.println(elements.pop());
	System.out.println("peek element="+elements.peek());
	System.out.println("index of 380= "+elements.search(380));
	System.out.println("index of 927= "+elements.search(927));
	
	System.out.println(elements.empty());
	}
}
