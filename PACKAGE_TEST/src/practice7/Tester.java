package practice7;
import java.util.ArrayList;

public class Tester {
	public static void main(String[] args) {
		
		Customer man1 = new Customer();
		Customer woman1 = new Customer();
		
		man1.money = 5000;
		woman1.money = 100000;
		
		man1.buy_ticket(2);
		woman1.buy_ticket(2);
	}
}
