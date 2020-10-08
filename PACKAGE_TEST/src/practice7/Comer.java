package practice7;

public class Comer {
	Money money;
	
	public void deposit(Bank bank) {
		bank.balance += this.money.value;
		this.money.value = 0;
	}
}
