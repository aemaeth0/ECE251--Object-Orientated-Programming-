import java.lang.Math;

public class loanCalculator {
	
public double monthlyPayment(double principle, double interestRate, int term)
{
	double A = principle;
	int t = term;
	double r;
 	double num_1;
	
	double monthlyPayment;
	
	r = interestRate /(100 * term);
	monthlyPayment = (A*r*Math.pow(r + 1,term)/(Math.pow(r + 1,term) - 1));
	return monthlyPayment;
}
public void displaySchedule(double principle, double interestRate, int term)
{
	
	double amountRemaining = principle;
	double r = interestRate /(100 * term); // monthly interest rate
	double sumTotalWithInterest = 0;
	double whatsLeft = 0;
	double totalLeft = 0;
	
    double payment = monthlyPayment(principle,interestRate,term);
    System.out.printf("\nMonthly payment will be: $%4.2f \n", payment );
    System.out.printf("\nThe loan is $%4.2f at an interest rate of %4.2f%%", principle, interestRate);
    System.out.printf("\n\nMonth \tPayment \tAmount Remaining");
    
    int i = 1;
	while (i <= 12)
	{
		sumTotalWithInterest = (amountRemaining * r) + amountRemaining;
		whatsLeft = whatsLeft+ amountRemaining *r;
		amountRemaining =  sumTotalWithInterest - payment;
		
		
		
		System.out.printf ("\n%d  \t$%4.2f \t$%4.2f",i,payment,amountRemaining);
		i++;
	}
	totalLeft = principle + whatsLeft;
	
System.out.printf("\n\nThe total amount paid was $%4.2f",totalLeft);

}

}