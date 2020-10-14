package projectEuler;
import java.util.*;

public class problem2 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);
		int hi= ((int)list.get(0))+((int)list.get(1));
		while(hi < 4000000) {
			hi = (int)list.get(list.size()-2) + (int)list.get(list.size()-1);
			list.add(hi);
		}
		System.out.println(list);
		
		int sum = 0;
		for(Object obj : list) {
			if((int)obj%2 == 0) {
				sum += (int)obj;
			}
		}
		System.out.println(sum);
	}
}
