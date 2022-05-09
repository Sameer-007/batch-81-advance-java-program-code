package com.wipro.setmapex;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
	
	public static void main(String[] args) {
		// A Unordered collection of elements that contains no duplicate elements
		System.out.println("HashSet - print elements in any order");
		Set<Integer> pincode=new HashSet<Integer>();
		pincode.add(600001);
		pincode.add(600002);
		pincode.add(600003);
		pincode.add(600004);
		pincode.add(600005);
		pincode.add(600001);
	
		System.out.println(pincode);
		System.out.println("LisnkedHashSet - prints elemenst in insertion order");
		Set<String> city=new LinkedHashSet<String>();
		city.add("Chennai");
		city.add("Mumbai");
		city.add("Kollam");
		city.add("Kolkata");
		
		System.out.println(city);
		System.out.println("TreeSet - prints elemenst in sorted order");
		Set<String> city1=new TreeSet<String>();
		city1.add("Salem");
		city1.add("Mumbai");
		city1.add("Kollam");
		city1.add("Benagaluru");
		System.out.println(city1);
		
		
	}

}
