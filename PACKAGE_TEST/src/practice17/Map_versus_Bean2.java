package practice17;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;


public class Map_versus_Bean2 {

	public static void main(String[] args) {
		HashMap sonata1 = new HashMap();
		sonata1.put("serial", 1000);
		sonata1.put("color", "white");
		
		List<Map> list_map = new ArrayList();
		list_map.add(sonata1);
		
		Sonata s1 = new Sonata(1000, "white");
		List<Sonata> list_bean = new ArrayList();
		list_bean.add(s1);
	}

}
