package practice7;

public class test {
	static int serial_number = 0;
	public static void main(String[] args) {
		int sum = 0;
		Apple[] appleBox = new Apple[1000];
		for(int i=0; i<appleBox.length; i++) {
			serial_number ++;
			appleBox[i] = new Apple(serial_number); //changed the Apple class a bit due to the lottery class
			sum += appleBox[i].individual_num;
		}
		System.out.println(appleBox);
		System.out.println(sum);
	}
}
