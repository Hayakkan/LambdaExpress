package com.eight.updates;

import java.util.function.Predicate;

public class statIntrefMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		statIntrefMain sm = new statIntrefMain();
		System.out.println("Stat-Intref-Main");
		//sm.m1();
		StatIntrafafce.m1();
		String s = "Arunkumar";
		Predicate<String> p = st->st.length()>5;
		System.out.println("Length of String > 5 :"+p.test(s));
		System.out.println("Length of String > !5 :"+p.negate().test(s));

	}

}
