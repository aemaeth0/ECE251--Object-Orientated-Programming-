
public class CustomerTestProgram5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer5 c1 = new Customer5();
		 c1.name = "Bob";
		 c1.age = 18;
		 Customer5 c2 = new Customer5();
		 c2.name = "Dottie";
		 c2.age = 3;
		 Customer5 c3 = new Customer5();
		 c3.name = "Steve";
		 c3.age = 68;
		 Customer5 c4 = new Customer5();
		 c4.name = "Jane";
		 c4.age = 66;
		 Customer5 c5 = new Customer5();
		 c5.name = "Janet";
		 c5.age = 4;
		System.out.println("The fee for Bob is $" + c1.computeFee());
		System.out.println("The fee for Dottie is $" + c2.computeFee());
		System.out.println("The fee for Steve is $" + c3.computeFee());
		System.out.println("The fee for Jane is $" + c4.computeFee());
		System.out.println("The fee for Janet is $" + c5.computeFee());
	}

}
