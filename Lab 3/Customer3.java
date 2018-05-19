
public class Customer3 {
	int age;
	char sex;
	float money;
	
	public Customer3()
	{
		
	}

	public void spend(float amount)
	{
		if ((money-amount) >= 0)
		money = money - amount;
		else
			System.out.println("You can't spend what you don't have silly!");
	}
}
