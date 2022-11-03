package com.package2;

public class StaticDemo {
	static int a=20;
	static void display() {
		System.out.println("Static Method");
	}
	static {
		System.out.println("Static Block");
	}

	public static void main(String[] args) {
		System.out.println(a);
		display();
		
	}

}



//the complier search for static block 1st.if static block is not there complier will go main method