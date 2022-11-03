package com.package2;

public class Student {
	int rollno;
	String name;
//	void insertRecord(int r,String n) {
//	 rollno=r;
//	 name=n;
//	 System.out.println(rollno+" "+name);
//		
//	}
	void insertRecord() {
		rollno=111;
		name="Sruthi";
		System.out.println(rollno+" "+name);
	}
	public static void main(String[] args) {
		Student s1=new Student();
//		Student s2=new Student();
//		s1.insertRecord(111, "Sruthi");
//		s2.insertRecord(222,"Madhuri");
	     s1.insertRecord();
	}    
}
