package com.handson;

public class Method {
	  public int sum(int a, int b) {
	    int k = a + b;
	    return k;
	  }
	  
	  public static void main(String [] args) {
	    Method m = new Method();
	    int result = m.sum(10, 20);
	    System.out.println("sum is " + result);
	    // prints - sum is 30
	  }
	}