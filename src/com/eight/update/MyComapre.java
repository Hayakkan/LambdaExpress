package com.eight.updates;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Supplier;






public class MyComapre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(145);
		al.add(35);
		al.add(87);
		al.add(65);
		al.add(98);
		al.add(102);
		al.add(222);
	System.out.println(al);
	//Comparator<Integer> c = (I1,I2)-> I1<I2?-1:I1>I2?1:0;
	//Collections.sort(al, (I1,I2)-> I1<I2?-1:I1>I2?1:0 );	
	Collections.sort( al, (I1,I2)-> I1<I2?-1:I1>I2?1:0 );
	System.out.println(al);
	}

}
