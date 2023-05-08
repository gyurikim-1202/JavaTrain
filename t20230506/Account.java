package t20230506;

public class Account {
	public static final int MIN_BALANCE = 0;
	public static final int MAX_BALANCE = 1000000;
	private int balance;
	
	public int getBalance() {
		return balance;
	}
	
	public void SetBalance() {
		if(balance < Account.MIN_BALANCE || balance > Account.MAX_BALANCE) {
			return;
		}
		this.balance = balance;
	}
	

}
