/*
Class: ECE25100 Object Oriented Programming
Instructor: Xiaoli Yang
Author: Alberto Pizano
Assignment: 1
File Name: StarDisplayTest.java
Date: 2/18/2018
*/



import java.util.Scanner;

public class StarDisplayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int a;
		        Scanner scanner= new Scanner(System.in);
		        System.out.println("Please enter a 5 digit integer : "  );
		        
		        a = scanner.nextInt();
		        StarDisplay s = new StarDisplay( );
		   //prompt the user to enter a 5-digit positive integer
		   //and initialize the above variable a:
		  		s.displayStar(a);
		    }
	}
