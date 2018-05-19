
public class Customer8 {
	boolean admitted;
	String name;
	int age;
	char sex;
	float money;

	public Customer8() {
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

	public boolean spend(float amount){
		float spent;
		if(amount < money)
		{
			spent = money - amount;
				money = spent;
			return true;
		}
		return false;
	}
		
	
	public void give(Customer8 cust, float amount)
	{
		//money = cust.money + amount;
		cust.money = cust.money + amount;
		money = money - amount;
		
	}
	
	public boolean payAdmission(){

		float fee = computeFee();
		admitted = spend(fee);

		if(!admitted)
		{
			return false;
		}
		return true;
	}

}
