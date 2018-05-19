import java.util.Scanner;

public class commandLineCalculator {
	int op1;
	int op2;
	
	public commandLineCalculator() {
	op1 = 0;
	op2 = 0;
	}

	public void calculate() {
		
		int answer = 0;
		int operation = 0;
		//int loop_cycle = 0;
		Scanner k = new Scanner(System.in);
		
			
		System.out.println("=======================================================\r\n" + 
					"Welcome to Purdue University Northwest's calculator!");
		
		System.out.println("1 - Addition\r\n" + 
					"2 - Subtraction\r\n" + 
					"3 - Multiplication\r\n" + 
					"4 - Division\r\n" + 
					"5 - Exit");
		
		while(operation != 5) {	
		System.out.println("Which operation do you want to perform: ");
		operation = k.nextInt();
		
		if(operation == 1)
		{
			System.out.println("What is your first operand:");
			op1 = k.nextInt();
			System.out.println("What is your second operand:"); 
			op2 = k.nextInt();
			answer = op1 + op2;
			System.out.println("The result is: " + answer);
		}
		else if(operation == 2)
		{
			System.out.println("What is your first operand:");
			op1 = k.nextInt();
			System.out.println("What is your second operand:"); 
			op2 = k.nextInt();
			answer = op1 - op2;
			System.out.println("The result is: " + answer);
		}
		else if(operation == 3)
		{
			System.out.println("What is your first operand:");
			op1 = k.nextInt();
			System.out.println("What is your second operand:"); 
			op2 = k.nextInt();
			answer = op1 * op2;
			System.out.println("The result is: " + answer);
		}
		else if(operation == 4)
		{
			System.out.println("What is your first operand:");
			op1 = k.nextInt();
			System.out.println("What is your second operand:"); 
			op2 = k.nextInt();
			if(op2 == 0) {
				System.out.println("Division by zero not allowed!");
				}
			else {
			answer = op1/op2;
			System.out.println("The result is: " + answer);}
			
		}
		/*
		else if(operation == 5)
		{
		loop_cycle = operation;
		}
		*/
				
		}
		System.out.println("Thanks for using Purdue University Northwest's calculator!\r\n" + 
				"=======================================================");
}
	
}
