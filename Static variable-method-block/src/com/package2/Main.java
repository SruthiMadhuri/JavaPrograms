package com.package2;
class Block{
	static int a=10;                 //static variable
	static void display() {
		System.out.println("Static Method");
	}
	static{
		System.out.println("Static Block");
	}
}
public class Main {
	public static void main(String[] args) {
		System.out.println("I am main method");      //if we have main it should print main method 1st 
                                                     //after main method ,static block will excuted
		System.out.println(Block.a);
		Block.display();

}
}


// if suppose we have another class .we can't access directly.we should call with class name