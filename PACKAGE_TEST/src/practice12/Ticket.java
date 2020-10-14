package practice12;

public class Ticket {
	public static int serial_number = 1000;
	
	int ticket_number;
	
	public Ticket(){
		this.ticket_number = ++serial_number; 
	}
	
	public boolean equals(Object object /*Ticket ticket*/) {
		//if(object instanceof Ticket){ instance check
		//(Ticket)object downcast
		if(this.ticket_number == ((Ticket)object).ticket_number) {
			return true;
		}else {
			return false;
		}
	}
}
