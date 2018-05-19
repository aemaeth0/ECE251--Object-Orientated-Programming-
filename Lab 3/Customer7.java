
public class Customer7 {
	String name;
	int age;
	char sex;
	float money;

	public Customer7() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean spend(float amount)
	{
		if ((money-amount) >= 0)
		{
		money = money - amount;
		return true;
		}
		else
		{
		return false;
		}
	}
	
	
}
