package OOPs.Inheritance;

class Account
{
	String accno;
	String name;
	int balance;

	Account(String accno1, String name1, int balance1)
	{
		accno=accno1;
		name=name1;
		balance=balance1;	
	}
}
class Transaction
{
	void deposit(Account account, int amount)
	{
		account.balance=account.balance+amount;
		System.out.println("Amount Deposited Successfully");
		System.out.println("Name : "+account.name);
		System.out.println("Account No : "+account.accno);
		System.out.println("Total Balance : "+account.balance);
	}
}
class BankApp
{
	public static void main(String[] args)
	{
		Account ob1=new Account("12345", "Deepak", 10000);

		Transaction ob2=new Transaction();
		ob2.deposit(ob1, 5000);
	}
}