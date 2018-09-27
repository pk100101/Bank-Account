
public class BankAccount {
	//fields
	private String name;
	private int accNum;
	private double balance;
	
	//constructors
	public BankAccount (String n, int aN, double bal) 
	{
		name = n;
		accNum = aN;
		balance = bal;
		
	}
	
	public BankAccount (String n, int aN)
	{
		name = n;
		accNum = aN;
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
