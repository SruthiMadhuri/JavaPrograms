package com.handson;

public class JavaInstance {
	int age;
	String name;
	//constructor method
	public JavaInstance(int age, String name) {
		this.age = age;
		this.name = name;
	}
	void display() {
		System.out.println("Age & Name is"+age+" "+name);
	}
	public static void main(String[] args) {
		JavaInstance obj1=new  JavaInstance(22,"Sruthi");
		JavaInstance obj2=new  JavaInstance(23,"Sai");
		obj1.display();
		obj2.display();
		
	}
	

}
