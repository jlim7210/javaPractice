package practice17;

import java.util.HashMap;
import java.util.Iterator;

public class CarMap {
	
	HashMap myMap;
	
	public CarMap(){
		myMap = new HashMap<Integer, Sonata>();
	}
	
	public void addSonata(Sonata car) {
		myMap.put(car.serial, car);
	}
	
	public void removeSonata(int number) {
//		Iterator ir = myMap.
	}
}
