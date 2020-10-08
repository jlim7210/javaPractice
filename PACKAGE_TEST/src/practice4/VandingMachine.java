package practice4;

public class VandingMachine {
	int money;
	int bevCount;
	Beverage bev;
	
	public VandingMachine(Beverage bev) {
		this.bevCount += 1;
		this.bev = bev;
	}
	
	public void takeMoney(Beverage sell) {
		money += sell.price;
		bevCount -= 1;
	}
}
