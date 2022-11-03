package com.handson;

public class Person {
	int age;
	String name;
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
	public static void main(String[] args) {
		Person p=new Person(22,"Madhuri");
		System.out.println("Age is:"+p.age);
		System.out.println("Name is:"+p.name);
	}	
}
