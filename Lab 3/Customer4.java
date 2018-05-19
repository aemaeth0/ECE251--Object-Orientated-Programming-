
public class Customer4 {
	String name;
	int age;
	char sex;
	float money;

	public Customer4() {
		// TODO Auto-generated constructor stub
	}

	public void give(Customer4 cust, float amount)
	{
		//money = cust.money + amount;
		cust.money = cust.money + amount;
		money = money - amount;
		
	}
}
