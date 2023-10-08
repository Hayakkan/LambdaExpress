package com.eight.updates;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class streamConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(22);
		marks.add(45);
		marks.add(98);
		marks.add(12);
		marks.add(73);
		marks.add(5);
		System.out.println("Marks :"+marks);
		List<Integer> filteredList = marks.stream().sorted().collect(Collectors.toList()); // Default NAtural Sorting order internally Comparable-CompareTo is Called 
		System.out.println("Default NAtural Sorting order internally Comparable-CompareTo is Called  :"+filteredList);			// assending order 5  10 20 
		filteredList = marks.stream().sorted( (I1,I2)->( (I1<I2) ?1: (I1>I2) ?-1:0 )).collect(Collectors.toList()); // Constumized Sorting order Camparotor - comapre is explicitly called 
		System.out.println("Constumized Sorting order Camparotor - comapre is explicitly called  :"+filteredList); // Desending order 20 10 5
		filteredList = marks.stream().sorted( (I1,I2)->I1.compareTo(I2) ).collect(Collectors.toList()); // Default NAtural Sorting order Explicitly Comparable-CompareTo is Called  
		System.out.println("Default NAtural Sorting order Explicitly Comparable-CompareTo is Called  :"+filteredList); // assending order 5  10 20 
		filteredList = marks.stream().sorted( (I1,I2)->-(I1.compareTo(I2)) ).collect(Collectors.toList()); // Default Natural Sorting order Explicitly Comparable-CompareTo is Called  But reversed 
		System.out.println("Default NAtural Sorting order Explicitly Comparable-CompareTo is Called But reversed using minus  :"+filteredList); // assending order 5  10 20 
		filteredList = marks.stream().sorted( (I1,I2)-> (I2.compareTo(I1)) ).collect(Collectors.toList()); // Default Natural Sorting order Explicitly Comparable-CompareTo is Called  But reversed 
		System.out.println("Default NAtural Sorting order Explicitly Comparable-CompareTo is Called But reversed Arguement  :"+filteredList); // assending order 5  10 20 
		 
		filteredList = marks.stream().filter(i->i>15).collect(Collectors.toList());
		System.out.println("FilteredList :"+filteredList);
		filteredList = marks.stream().map(i->i+15).sorted().collect(Collectors.toList());
		System.out.println("FilteredList :"+filteredList);
		Integer min =  marks.stream().min((I1,I2)->I1.compareTo(I2)).get();
		System.out.println("Min :"+min);
		

	}

}
