
public class CustomerTestProgram6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer6 c1 = new Customer6();
		 c1.name = "Bob";
		 c1.age = 17;
		 c1.money = 10;
		 
		Customer6 c2 = new Customer6();
		 c2.name = "Dottie";
		 c2.age = 3;
		 c2.money = 0;
		 
		Customer6 c3 = new Customer6();
		 c3.name = "Steve";
		 c3.age = 67;
		 c3.money = 30;
		 
		Customer6 c4 = new Customer6();
		 c4.name = "Jane";
		 c4.age = 64;
		 c4.money = 0;
		 
		System.out.println("Here is the situation before going into the circus:");
		System.out.println(" Bob has $" + c1.money);
		System.out.println(" Dottie has $" + c2.money);
		System.out.println(" Steve has $" + c3.money);
		System.out.println(" Jane has $" + c4.money);
		
		// Simulate people going into the circus
		c1.payAdmission();
		c2.payAdmission();
		c3.payAdmission();
		//c4.payAdmission();
		
		c3.give(c4, 15);
		c4.payAdmission();
		
		System.out.println("Here is the situation after going into the circus:");
		System.out.println(" Bob has $" + c1.money);
		System.out.println(" Dottie has $" + c2.money);
		System.out.println(" Steve has $" + c3.money);
		System.out.println(" Jane has $" + c4.money);

	}

}
