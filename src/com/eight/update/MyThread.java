package com.eight.update;

public class MyThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunnable r = new MyRunnable();
		Thread thread = new Thread (r);
		thread.start();
		for (int i=0;i<10;i++ ) {
			 System.out.println("Thread Parent");
		 }

	}

}
