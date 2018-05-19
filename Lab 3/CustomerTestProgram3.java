
public class CustomerTestProgram3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer3 c = new Customer3();
		 c.money = 50;
		 System.out.println(c.money);
		 c.spend(10);
		 c.spend(4.75f);
		 c.spend(15.25f);
		 System.out.println(c.money);
		 c.spend(100);
		 System.out.println(c.money);
	}

}
