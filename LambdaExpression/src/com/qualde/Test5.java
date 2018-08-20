package com.qualde;
import java.util.*;

public class Test5 {
	public static void main(String[] args) {		
		List<Student> students=new ArrayList<>();
		students.add(new Student(101,"Sachin", 65));
		students.add(new Student(102,"Arjun", 82));
		students.add(new Student(103,"Rohan", 87));
		students.add(new Student(104,"Sohan", 35));
		students.add(new Student(105,"Rakesh", 70));
		students.add(new Student(106,"Sachin", 19));

		System.out.println(students);
		
		System.out.println("----  sorting according to marks using lambda expression ----");
		Collections.sort(students,(s1,s2)->{return s1.getMarks()-s2.getMarks();});
		System.out.println(students);
	}
}

/*class Student{
	
	private int sid;
	private String sname;
	private int marks;
	public Student(int sid, String sname, int marks) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.marks = marks;
	}
		
	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "\nStudent [sid=" + sid + ", sname=" + sname + ", marks=" + marks + "]";
	}	
	
}

*/