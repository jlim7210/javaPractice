package practice7;
import java.util.ArrayList;

public class Station {
	private static String name = "Seoul Station";
	private static ArrayList<Ticket> ticket = new ArrayList<Ticket>();
	
	private static int money;
	
	//constructor
	private static Station station = new Station(1);
	private Station(int num) {
		for(int i=0; i<num; i++) {
			Station.ticket.add(new Ticket());
		}
	}
	
	//Method
	public static String get_station_name() {
		return Station.name;
	}
	
	public static int get_station_money() {
		return Station.money;
	}
	
	public static int get_station_ticket_count() {
		return Station.ticket.size();
	}
	
	public static ArrayList get_station_ticket_pool() {
		return Station.ticket;
	}
	
	public static void sell_tickets() {
		Station.ticket.remove(0);
		Station.money += Ticket.getPrice();
	}
}
