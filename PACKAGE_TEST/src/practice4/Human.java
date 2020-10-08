package practice4;

public class Human {
	int money;
	
	public Human(int num) {
		this.money = num;
	}
	
	public Human() {
		this(10000);
	}
	
	public void buyDrink(VandingMachine vm) {
		vm.takeMoney(vm.bev);
		this.money -= vm.bev.price;
	}
}
