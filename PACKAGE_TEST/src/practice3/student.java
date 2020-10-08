package practice3;

public class student {
	public String studentName;
	public int grade;
	public int money;
	
	public student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
}
