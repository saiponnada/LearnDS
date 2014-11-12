
public class Bank {
	private float balance =0;
	
	float getBalance()
	{
		return balance;
	}
	
	float deposit(float amount)
	{
		balance = balance + amount;
		return balance;
	}
	
	float withdrawl(float amount)
	{
		balance = balance - amount;
		return balance;
	}
}
