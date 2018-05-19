
public class CustomerTestProgram7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer7 c = new Customer7();
		 c.money = 50;
		 System.out.println( c.money + "\n" );
		 
		if (!c.spend(10))
		 System.out.println("Unable to spend $10");
		if (!c.spend(4.75f))
		 System.out.println("Unable to spend $4.75");
		if (!c.spend(15.25f))
		 System.out.println("Unable to spend $15.25");
		if (!c.spend(100))
		 System.out.println("Unable to spend $100");
		 System.out.println(c.money);
		 
		if (!c.spend(100))
		 System.out.println("Unable to spend $100");
	}

}
