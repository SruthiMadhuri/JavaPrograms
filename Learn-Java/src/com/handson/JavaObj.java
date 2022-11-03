package com.handson;

public class JavaObj {
	int age;
	String name;
	void value() {
		age=22;
		name="Sruthi";
		System.out.println("Age is "+age);
		System.out.println("Name is "+name);
	}

	public static void main(String[] args) {
		JavaObj O1=new JavaObj();
		O1.value();

	}

}




/*In Java, instances of a class are known as objects. 
Every object has state and behavior in the form of instance fields and methods respectively.*/