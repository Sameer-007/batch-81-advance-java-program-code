package com.wipro.javaeight;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PreDefiedFunctional {

	public static void main(String[] args) {
		// Predefined Functional Interface\
		// Represents a function that accepts one argument and produces a result. 
		Function<Integer, Double> areaCircle = (radius) -> {
			double area = 3.14 * radius * radius;
			return area;
		};
		Double apply = areaCircle.apply(12);
		System.out.println("Area of Circle  " + apply);
		// Represents a predicate (boolean-valued function) of one argument.
		Predicate<Integer> oddEven = (no) -> no % 2 == 0;
		boolean test = oddEven.test(101); // Evaluates this predicate on the given argument.
		if (test) {
			System.out.println("Even Number");
		} else {
			System.out.println("Odd Number");
		}
		// Represents a supplier of results.
		Supplier<Integer> supplier = () -> {
			int a = 100;
			return a;
		};
		System.out.println(supplier.get());
		// Represents an operation that accepts a single input argument and returns no result
		Consumer<String> consumer = (name) -> {
			System.out.println("Welcome Mr." + name);
		};
		consumer.accept("Wipro");
	}
}
