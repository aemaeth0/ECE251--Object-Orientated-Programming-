/*
Class: ECE25100 Object Oriented Programming
Instructor: Xiaoli Yang
Author: Alberto Pizano
Assignment: 1
File Name: ChangeCalculator.java
Date: 2/18/2018
*/

public class ChangeCalculator {
	
	public ChangeCalculator() {
		// TODO Auto-generated constructor stub
	}

	public void change(double cost)
	{
		double convert = cost/100;
		
		if(500 - cost < 0)
		System.out.println("You don't have enough money to cover the costs!");
		
		else 
		{
		int dollars = (int) (500 - cost)/100;
		double dollars2 = (500 - cost)/100;
		int change = 5 -dollars;
		
		System.out.println("The change from $5.00 from $" + convert + " in cents is: ");
		
		System.out.println(dollars + " dollar(s)");
		
		int quarters = (int)(((dollars2)%(1))/.25);
		System.out.println(quarters + " quarter(s)");
		
		int dimes = (int)((((dollars2)%(1))-(quarters*.25))/.10);
		System.out.println(dimes + " dimes(s)");
		
		int nickels = (int)(((((dollars2)%1) - (quarters*.25)) - (dimes*.10))/.05);
		System.out.println(nickels + " nickel(s)");
		
		int pennies = (int)(100*(((((dollars2)%1) - (quarters*.25)) - (dimes*.10))-(nickels*.05)));
		System.out.println(pennies + " pennies(s)");

	}
	}
}
