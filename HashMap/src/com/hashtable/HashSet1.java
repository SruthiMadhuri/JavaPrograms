package com.hashtable;

import java.util.HashSet;
import java.util.Set;

public class HashSet1{

	public static void main(String[] args) {
		Set<Integer> hashSet=new HashSet<>();
		hashSet.add(3);
		hashSet.add(2);
		hashSet.add(1);
		hashSet.remove(2);
		if(!hashSet.contains(2)) {
			System.out.println("Key 2 is not in hashset");
	}
		System.out.println("The size of the hashset:"+hashSet.size());
		for(Integer i:hashSet) {
			System.out.print(i+" ");
		}
		System.out.println("are in the hashset");
		hashSet.clear();
		if(hashSet.isEmpty()) {
			System.out.println("hashset is empty now!");
		}

	}

}
