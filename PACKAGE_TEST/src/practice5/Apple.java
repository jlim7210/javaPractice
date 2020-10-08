package practice5;

public class Apple {
	static int serialNumber = 1000;
	int number;
	
	public Apple() {
		serialNumber++;
		number = serialNumber;
	}
}
