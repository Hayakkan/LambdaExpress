package com.eight.updates;


public class FunctionMain {

	public FunctionMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionInterface fi = ()-> System.out.println("Hello-World-Main");
		//FunctionInterface fi = new FunctionIntrfImpl();
		fi.m1();
		
//		Runnable r = ()->{ 
//			for ( int i=0;i<10;i++)
//				System.out.println("Child-Thread"+i);
//		};
		Runnable r = new MyRunnable();
		Thread t = new Thread(r);
		Thread t1 = new Thread(r);
		t.start();
		t1.start();
		for ( int i=0;i<10;i++)
			System.out.println("Main-Thread"+i);
		
		

	}

}
