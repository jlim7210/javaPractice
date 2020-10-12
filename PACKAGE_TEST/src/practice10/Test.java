package practice10;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
	public static void can_you_fly(Flyable f1) {
		f1.GET_FLYING_FUNCTION();
	}
	
	public static void can_you_fly(List<Flyable> list) {
		for(Flyable f1 : list) {
			f1.GET_FLYING_FUNCTION();
		}
	}
	
	public static void can_you_fly(ArrayList<Flyable> list) {
		for(Flyable f1 : list) {
			f1.GET_FLYING_FUNCTION();
		}
	}
	
	public static void get_you_landing(Landable l1) {
		l1.LANDING();
	}
	
	public static void main(String[] args) {
		System.out.println(Constants.WATER_BOIL);
		if(Constants.NAME instanceof String) {
			System.out.println((double)Constants.PI);
		}

		Flyable bird = new Bird();
		Flyable airplane = new Airplane();
		
		can_you_fly(bird);
		can_you_fly(airplane);
		get_you_landing((Landable)bird);
		get_you_landing((Landable)airplane);
	}
}
