
public class BankAccount {
	//fields
	private String name;
	private int accNum;
	private double balance;
	
	//constructors
	public BankAccount () 
	{
		name = "Pragnya";
		accNum = 190404;
		balance = 0.00;
		
	}
	
	public BankAccount (double startNum)
	{
		name = "Pragnya";
		accNum = 190404;
		balance = startNum;
		
	}
	//methods
	public void deposit (double deposit) 
	{
		balance = balance + deposit;
	}
	
	public void withdraw (double withdraw)
	{
		balance = balance - withdraw;
	}
	
	public double getBalance ()
	{
		return balance;
	}
	
	public String toString ()
	{
		return balance;
		return accNum;
		return name;
	}
}
