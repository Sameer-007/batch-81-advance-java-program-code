package com.wipro.datastructure;

import java.util.ArrayList;
import java.util.List;

// Variable Datatype Operators Conditional/Looping Array/String Exception IOStreams
public class App {
	public static void main(String[] args) {
		// Array - Datastructure - used to stored data in continuous memory location
		int[] marks = new int[5]; // fixed size // 5*4 = 20 Bytes
		marks[0] = 100;
		marks[1] = 200;
		// 8 bytes -> Wasted 12 Bytes
		// List and its method
		ArrayList<Integer> list = new ArrayList<Integer>(); // Dynamic size
		list.add(100); // 0
		list.add(200); // 1
		list.add(300); // 2
		list.add(400); // 3
		list.add(500); // 4
		list.add(100); // Lists can contain duplicate elements
		// sum of an array elements
		System.out.println(list); // List — an ordered collection
		Integer indexTwo = list.get(2);
		System.out.println(indexTwo);
		
		Integer removedVal = list.set(2, 3000);
		System.out.println("Removed val " + removedVal);
		System.out.println(list);
		
		boolean contains = list.contains(3000);
		if(contains) {
			System.out.println("3000 is present");
		}
		else {
			System.out.println("3000 is not found");
		}
		
		Integer removeIndexVal = list.remove(0);
		System.out.println(removeIndexVal);
		System.out.println(list);
		System.out.println(list.indexOf(200));
		System.out.println(list.lastIndexOf(200));
		System.out.println(list.isEmpty());
		Object[] array = list.toArray();
		System.out.println();
		
		List<Integer> subList=list.subList(0, 4);
		System.out.println("Sub List " +  subList);
		
		System.out.println(list.equals(subList));
		
		
		int sum = 0;
		for (Integer val : list) {
			sum = sum + val;
		}
		System.out.println("Sum " + sum);
		
		System.out.println("Size/Length of array " + list.size());
		for (int i = 0; i < list.size(); i++) {
			sum = sum + list.get(i);
		}
		System.out.println("Normal For loop " + sum);

	}
}
