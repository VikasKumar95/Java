package com.qualde;
import java.util.*;
import java.util.stream.Stream;

public class Test6 {
	public static void main(String[] args) {		
		List<Student> students=new ArrayList<>();
		students.add(new Student(101,"Sachin", 65));
		students.add(new Student(102,"Arjun", 82));
		students.add(new Student(103,"Rohan", 87));
		students.add(new Student(104,"Sohan", 35));
		students.add(new Student(105,"Rakesh", 70));
		students.add(new Student(106,"Sachin", 19));

		System.out.println(students);
		
		System.out.println("----  filter students according to marks using lambda expression ----");
		Stream<Student> filteredStudent=students.stream().filter(s->s.getMarks()>30 && s.getMarks()<80);
		filteredStudent.forEach(student->System.out.println(student));
	
	}
}

class Student{
	
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

