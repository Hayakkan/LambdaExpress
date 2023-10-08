package com.eight.update;

public class lambdaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LambdaIntref lam =(a,b)-> System.out.println("The Sum :"+(a+b) );
		lam.add(10,20);
		lam.add(20,30);
		lam.add(40,50);
		lambdaSquare lsq = n -> System.out.println("Square of :"+(n*n)); 
		lsq.squareIt(25);
		lsq.squareIt(45);
		lsq.squareIt(15);

	}

}
