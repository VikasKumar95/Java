package com.qualde;
import java.util.*;
public class Test15 {	
	public static void main(String[] args) {
		TreeSet<Student> t=new TreeSet<>();
		t.add(new Student(2,"Anuj",58));
		t.add(new Student(5,"Ankur",28));
		t.add(new Student(1,"Mukesh",48));
		t.add(new Student(7,"Ramesh",50));	
		
Iterator<Student> it=t.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}	
}
}

class Student implements Comparable<Student> {
	int sid;
	String name;
	long marks;
	Student(int sid,String name,long marks){
		this.sid=sid;
		this.name=name;
		this.marks=marks;	
	}
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student st) {	
		return this.sid-st.sid;
	}
}
