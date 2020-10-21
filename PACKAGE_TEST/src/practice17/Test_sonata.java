package practice17;

import java.util.HashMap;

public class Test_sonata {

	public static void main(String[] args) {

		HashMap mySonata = new HashMap();
		
		Sonata car1 = new Sonata(1000, "red");
		Sonata car2 = new Sonata(1001, "red");
		Sonata car3 = new Sonata(1001, "red");
		Sonata car4 = new Sonata(1002, "green");
		
		mySonata.put(car1.serial, car1);
		mySonata.put(car2.serial, car2);
		mySonata.put(car3.serial, car3);
		mySonata.put(car4.serial, car4);
		
		System.out.println("end");
	}

}
