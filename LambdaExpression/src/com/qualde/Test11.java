package com.qualde;
public class Test11{
	public static void main(String[] args) {		
		In1 in1=Hi::sayHello;
		in1.hello();
		
		In2 in2=Hi::sayBye;
		in2.bye("Bye");		
	}
}

class Hi{
	public static void sayHello() {
		System.out.println("sayHello() method");
	}
	public static void sayBye(String str) {
		System.out.println("sayBye() method"+str);
	}
}

interface In1{	
	void hello();
}

interface In2{
	void bye(String str);	
}