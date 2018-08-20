package com.qualde;
import java.util.PriorityQueue;

public class Test16 {

		public static void main(String[] args) {
			PriorityQueue<String> pq=new PriorityQueue<>();
			
			pq.offer("rose");
			pq.add("Dahlia");
			pq.add("Lotus");
			System.out.println(pq);
			pq.offer("Lily");
			pq.offer("Jasmine");
			
			System.out.println(pq);
			
			System.out.println("peek="+pq.peek());
			System.out.println("peek="+pq.element());
			System.out.println(pq);
			
			System.out.println(pq.poll());
			
			System.out.println(pq.remove());
			
			System.out.println(pq);
		}	
	
}
