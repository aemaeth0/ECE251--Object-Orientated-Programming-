
public class Customer6 {
	
	String name;
	int age;
	char sex;
	float money;

	public Customer6() {
		// TODO Auto-generated constructor stub
	}
	
	public float computeFee()
	{
		if(age >= 65)
		
			return 6.375f;
		
		else if(18 <= age && age < 65)
		
			return 12.75f;
		
		
		else if(age >= 4 && age <= 17)
		
				return 4.75f;
		
		else
		
			return 0.0f;
		
	}
		
		
		public void spend(float amount)
		{
			if ((money-amount) >= 0)
			money = money - amount;
			else
				System.out.println("You can't spend what you don't have silly!");
		}
		
		public void give(Customer6 cust, float amount)
		{
			//money = cust.money + amount;
			cust.money = cust.money + amount;
			money = money - amount;
			
		}
	
	public void payAdmission()
	{
		
		money = money - computeFee();
		
	}

}
