
public class BankAccount {
	private String owner;
	private int balance;
	
	public BankAccount() {
		this("모름", -1);
	}
	
	public BankAccount(String owner, int balance) {
		this.owner = owner;
		this.balance = balance;
	}
	
	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String toString() {
		return owner + "\t" + balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) throws NegativeBalanceException {
		if(balance < money) // 출금액이 잔고보다 많은 경우
			throw (new NegativeBalanceException());
		else
			balance -= money;
	}
	
}
