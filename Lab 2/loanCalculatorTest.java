import java.util.GregorianCalendar;
import java.util.Scanner;

public class loanCalculatorTest {

	public static void main(String[] args) {
		
		
	// TODO Auto-generated method stub
		
		Scanner k = new Scanner(System.in);
		GregorianCalendar today = new GregorianCalendar();
		
	
		
		
		System.out.println("Welcome to the Purdue University Northwest Loan Calculator");
		System.out.println("Today is: " + today.getTime());
		System.out.println("=======================================");
				
		System.out.println("\nEnter the amount of the loan (e.g. 5000.00): ");
		double principle = k.nextInt();			
		System.out.println("Enter the annual interest rate: (e.g. 7.0): ");
		double annualInterestRate = k.nextDouble();
		System.out.println("Enter the term in months: (e.g. 60): ");
		int term = k.nextInt();
		
		loanCalculator m= new loanCalculator();
		m.monthlyPayment(principle,annualInterestRate,term);
		m.displaySchedule(principle,annualInterestRate,term);		
		
		k.close();
	}

}
