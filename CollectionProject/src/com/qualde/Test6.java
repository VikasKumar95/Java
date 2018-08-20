package com.qualde;
import java.util.*;
public class Test6 {	
	public static void main(String[] args) {	
	ArrayList<String> companyList=new ArrayList<>();
		
	companyList.add(0,"Qualde");
	companyList.add(1,"IBM");
	companyList.add(2,"TCS");
	companyList.add(3,"CGI");
	System.out.println(companyList);
	
	String company=companyList.get(2);
	System.out.println(company);
		
	 company=companyList.set(1,"Infosys");
	System.out.println(company);
	
	System.out.println(companyList);
	
	company=companyList.remove(2);
	System.out.println(company);
	
	System.out.println(companyList);	
	}
}
