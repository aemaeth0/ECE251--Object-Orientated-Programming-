/*
Class: ECE25100 Object Oriented Programming
Instructor: Xiaoli Yang
Author: Alberto Pizano
Assignment: 1
File Name: ChangeCalculatorTest.java
Date: 2/18/2018
*/


import java.util.Scanner;

public class ChangeCalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner k = new Scanner(System.in);
		
		System.out.println("Enter the cost of candies (in cents):");
		double cost = k.nextDouble();
		
		ChangeCalculator calc1 = new ChangeCalculator();
		
		calc1.change(cost);

	}
}
