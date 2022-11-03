package com.package2;

public class Variables {
	static int a=10;    //static variable
	int data=90;  //instance variable
		public static void main(String[] args) {
		int b=9;            //local variable
		System.out.println(a);
		System.out.println(b);
		Variables obj=new Variables();
		System.out.println(obj.data);
		
		
	}

}
