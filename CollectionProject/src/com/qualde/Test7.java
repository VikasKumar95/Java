package com.qualde;
import java.util.*;
public class Test7 {
	public static void main(String[] args) {
		
	ArrayList<String> companyList=new ArrayList<>();		
	companyList.add(0,"Qualde");
	companyList.add(1,"IBM");
	companyList.add(2,"TCS");
	companyList.add(3,"CGI");
	companyList.add(4,"Infosys");
	
	System.out.println("--------iterate elements using Iterator----------");
	Iterator<String> it=companyList.iterator();
	while(it.hasNext()){
		System.out.println(it.next());
	}
	
	System.out.println("--------iterate elements using ListIterator----------");
	
	ListIterator<String> lt=companyList.listIterator();
	
	while(lt.hasNext()){
		System.out.println(lt.next());
	}
	
System.out.println("--------reverse order----------");
	
	ListIterator<String> ltprev=companyList.listIterator(4);
	
	while(ltprev.hasPrevious()){
		System.out.println(ltprev.previous());
	}
		
	}
}
