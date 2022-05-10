package com.wipro.javaeight;
@FunctionalInterface // a functional interface has exactly one abstract method.
interface Calculator {
	// Single abstract method
	int add(int x, int y);
}
@FunctionalInterface
interface MyFunction {
	public String printCompanyName();
}
@FunctionalInterface
interface Calculate{
	public int incrementByFive(int a);
}
public class App {
	public static void main(String[] args) {
		Calculator cal = (x, y) -> {
			int sum = x + y;
			return sum;
		};
		int add = cal.add(10, 30);
		System.out.println(add);
		MyFunction function = () -> "Wipro Limited";
		System.out.println(function.printCompanyName());
		Calculate calculate= (a) -> {
			a=a+5;
			return a;
		};
		System.out.println(calculate.incrementByFive(10));
	} 

}

//Collection - List (ArrayList / LinkedList)
		// Set -(HashSet)
		// Map -(HashMap)
		// Functional Interface and Lambda Expression
		// Java Interface contains one and only abstract method (Single Abstract Method)
		// Used to Implement the method defined in functional interface

