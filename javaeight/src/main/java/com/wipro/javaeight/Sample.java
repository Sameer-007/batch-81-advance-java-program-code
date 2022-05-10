package com.wipro.javaeight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Sample {
	
	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();
		
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		list.add(600);
		list.add(700);
		
		// Java 8 For Each
		
		list.forEach((value)->{
			System.out.println(value);
		});
		
		
		LocalDate today=LocalDate.now();  //yyyy-MM-dd
		System.out.println(today);
		//dd-MM-yyyy dd/MM/yyyy
		String doj="30/01/2020";
		
		// String ->  Date  ==> Formatter
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dateOfJoining = LocalDate.parse(doj, dtf);
		System.out.println("Date of Joining " + dateOfJoining);
		
		System.out.println(dateOfJoining.plusDays(10));
		System.out.println(dateOfJoining.plusMonths(10));
		System.out.println(dateOfJoining.plusYears(10));
		
		System.out.println(dateOfJoining.minusDays(10));
		System.out.println(dateOfJoining.minusMonths(10));
		System.out.println(dateOfJoining.minusYears(10));
		
		
		System.out.println(today.isAfter(dateOfJoining));
		System.out.println(today.isBefore(dateOfJoining));
		System.out.println(today.isEqual(dateOfJoining));
		
		long noOfDays = ChronoUnit.DAYS.between(today, dateOfJoining);
		System.out.println(noOfDays);
		long noOfMonths = ChronoUnit.MONTHS.between(today, dateOfJoining);
		System.out.println(noOfMonths);
		long noOfYears = ChronoUnit.YEARS.between(today, dateOfJoining);
		System.out.println(noOfYears);
		
		
		System.out.println(dateOfJoining.getMonth());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
     		
		
	}

}
