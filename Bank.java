package exception;

public class Bank {
	private String acc_NO;
	private double balance;
	
	public Bank(String acc_NO, double balance) {
		super();
		this.acc_NO = acc_NO;
		this.balance = balance;
	}
	
	public void withdraw(double amt) throws InsufficientBalanceException
	{
		if(amt>balance)
		{
			throw new InsufficientBalanceException("Withdraw amount is higher than balance");
		}
		else
		{
			balance-=amt;
			System.out.println("Current balance:"+balance);
		}
	}
	

}

