
public class Customer5 {
	String name;
	int age;
	char sex;
	float money;

	public Customer5() {
		// TODO Auto-generated constructor stub
	}
	
	public float computeFee()
	{
		if(age >= 18 && age <65)
		{
			return 12.75f;
		}
		else if(age >= 65)
		{
			return 6.375f;
		}
		else if(age >= 4 && age <= 17)
		{
				return 4.75f;
		}
		else
		{
			return 0.00f;
		}
			
	}

}
