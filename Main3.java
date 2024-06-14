package inheritance;
//Superclass
class Account {
 protected String accountNumber;
 protected double balance;

 public Account(String accountNumber) {
     this.accountNumber = accountNumber;
     this.balance = 0.0;
 }

 public void deposit(double amount) {
     balance += amount;
     System.out.println("Deposited " + amount + " into account " + accountNumber);
 }

 public void withdraw(double amount) {
     if (balance >= amount) {
         balance -= amount;
         System.out.println("Withdrawn " + amount + " from account " + accountNumber);
     } else {
         System.out.println("Insufficient funds in account " + accountNumber);
     }
 }

 public void calculateInterest() {
     // Default implementation
     System.out.println("Interest calculation not implemented for account " + accountNumber);
 }

 public void displayBalance() {
     System.out.println("Balance in account " + accountNumber + ": " + balance);
 }
}

//Subclass 1
class SavingsAccount extends Account {
 private double interestRate;

 public SavingsAccount(String accountNumber, double interestRate) {
     super(accountNumber);
     this.interestRate = interestRate;
 }

 @Override
 public void calculateInterest() {
     double interest = balance * interestRate / 100.0;
     balance += interest;
     System.out.println("Interest calculated and added to account " + accountNumber);
 }
}

//Subclass 2
class CheckingAccount extends Account {
 private double overdraftLimit;

 public CheckingAccount(String accountNumber, double overdraftLimit) {
     super(accountNumber);
     this.overdraftLimit = overdraftLimit;
 }

 @Override
 public void withdraw(double amount) {
     if (balance + overdraftLimit >= amount) {
         balance -= amount;
         System.out.println("Withdrawn " + amount + " from account " + accountNumber);
     } else {
         System.out.println("Exceeded overdraft limit in account " + accountNumber);
     }
 }
}

public class Main3 {

	public static void main(String[] args) {
		 // Creating objects of SavingsAccount and CheckingAccount
        SavingsAccount savingsAccount = new SavingsAccount("SA123", 5.0);
        CheckingAccount checkingAccount = new CheckingAccount("CA456", 1000.0);

        // Depositing and withdrawing from accounts
        savingsAccount.deposit(1000);
        savingsAccount.calculateInterest();
        savingsAccount.displayBalance();

        checkingAccount.deposit(2000);
        checkingAccount.withdraw(1500);
        checkingAccount.displayBalance();	

	}

}
