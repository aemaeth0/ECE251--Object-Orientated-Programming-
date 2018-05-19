
public class CustomerTestProgram4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer4 c1 = new Customer4();
		 c1.money = 50;
		 Customer4 c2 = new Customer4();
		 System.out.println("Before giving ...");
		 System.out.println("c1 has $" + c1.money);
		 System.out.println("c2 has $" + c2.money);
		 c1.give(c2, 23.75f);
		 System.out.println("After giving ...");
		 System.out.println("c1 has $" + c1.money);
		 System.out.println("c2 has $" + c2.money);
	}

}
