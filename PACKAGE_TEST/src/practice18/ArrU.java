package practice18;

import java.util.ArrayList;

public interface ArrU {
	int get_size(ArrayList arr);
	
	//default methods don't make a lambda expression an error but only multiple abstract methods do.
	default int get_int(int num) {
		System.out.println(num);
		return num;
	}
}
