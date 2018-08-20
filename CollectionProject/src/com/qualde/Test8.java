package com.qualde;
import java.util.*;
public class Test8 {
	public static void main(String[] args) {	
	LinkedList<String> animalList=new LinkedList<>();		
	animalList.add("Lion");
	animalList.add(1,"Dog");
	animalList.addFirst("Cat");
	animalList.addLast("Deer");
	animalList.offer("Tiger");
	animalList.offerFirst("Lion");
	animalList.offerLast("Horse");
	System.out.println(animalList);
	
	System.out.println(animalList.element());
	System.out.println(animalList.get(3));
	System.out.println(animalList.getFirst());
	System.out.println(animalList.getLast());
	System.out.println(animalList);

	System.out.println(animalList.peek());
	System.out.println(animalList.peekFirst());
	System.out.println(animalList.peekLast());	
	System.out.println(animalList);
	
	System.out.println(animalList.poll());
	System.out.println(animalList.pollFirst());
	System.out.println(animalList.pollLast());
	System.out.println(animalList);
	System.out.println(animalList.pop());
	animalList.push("Bear");	
	animalList.push("Dog");
	animalList.push("Cat");
	System.out.println(animalList);
	
	System.out.println(animalList.remove());	
	System.out.println(animalList.removeLastOccurrence("Dog"));
	System.out.println(animalList);	
	}
}
