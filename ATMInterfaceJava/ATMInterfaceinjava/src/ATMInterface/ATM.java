package ATMInterface;

public class ATM {

	private double balance;
	private double depositeMoney;
	private double withdrawMoney;
	
	//Default constructor
	public ATM(){}

	//getter & setter methods 
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getDepositeMoney() {
		return depositeMoney;
	}

	public void setDepositeMoney(double depositeMoney) {
		this.depositeMoney = depositeMoney;
	}

	public double getWithdrawMoney() {
		return withdrawMoney;
	}

	public void setWithdrawMoney(double withdrawMoney) {
		this.withdrawMoney = withdrawMoney;
	}
	
}


