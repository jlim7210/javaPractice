package practice17;

import java.util.HashMap;
import java.util.Map;

public class Map_versus_JavaBean {
	
	public static void main(String[] args) {
		HashMap map = new HashMap();
		
		HashMap sonata1 = new HashMap();
		HashMap sonata2 = new HashMap();
		HashMap sonata3 = new HashMap();
		sonata1.put(1000, "white");
		sonata2.put(1001, "white");
		sonata3.put(1002, "white");
		
		map.put(sonata1.keySet(), sonata1);
		map.put(sonata2.keySet(), sonata2);
		map.put(sonata3.keySet(), sonata3);
		
	}

}
