package practice7;
import java.util.ArrayList;

public class Customer {
	int money;
	ArrayList<Ticket> owned_ticket = new ArrayList<Ticket>();
	
	public void buy_ticket(int num) {
		int pay = Ticket.getPrice()*num;
		
		if(this.money >= pay && Station.get_station_ticket_count() > num) {
			this.money -= pay;
			for(int i=0; i<num; i++) {
				this.owned_ticket.add((Ticket)Station.get_station_ticket_pool().get(0));
				Station.sell_tickets();
			}
		} else if (this.money < pay && Station.get_station_ticket_count() > num) {
			System.out.println("�ܰ� �����մϴ�.");
		} else if (Station.get_station_ticket_count() < num) {
			System.out.println("���� Ƽ���� ��: " + Station.get_station_ticket_count());
			System.out.println("Ƽ�� �ܷ��� �����մϴ�.");
		}
	}
}
