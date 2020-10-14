package practice12;

public class Test {
	public static void main(String[] args) {
		Ticket t1_1 = new Ticket();
		Ticket t1_2 = t1_1;
		Ticket t2_1 = new Ticket();
		
		System.out.println("== equation: " + t1_1.ticket_number + " and " + t1_2.ticket_number + " are " + (t1_1 == t1_2));
		System.out.println("equals equation: " + t1_1.equals(t1_2));
		System.out.println();
		
		System.out.println("== equation: " + t1_1.ticket_number + " and " + t2_1.ticket_number + " are " + (t1_1 == t2_1));
		System.out.println("equals equation: " + t1_1.equals(t2_1));
		System.out.println();
	
		t2_1.ticket_number--; // t2_1.ticket_number = t1_1.ticket_number;
		System.out.println("== equation: " + t1_1.ticket_number + " and " + t2_1.ticket_number + " are " + (t1_1 == t2_1));
		System.out.println("equals equation: " + t1_1.equals(t2_1));
	}
}
