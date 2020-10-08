package practice7;

public class Ticket {
	private static int the_code = 1000;
	
	private static int price = 39000;
	private int serial_number;
	
	//constructor
	public Ticket() {
		this.serial_number = Ticket.the_code;
		Ticket.the_code++;
	}
	
	//methods
	public static int getPrice() {
		return Ticket.price;
	}

	public int getSerial_number() {
		return this.serial_number;
	}
}
