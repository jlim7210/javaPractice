package practice11;
import java.util.Arrays;

import personal_practice.Sorts;

import java.util.ArrayList;

public class Test implements Sorts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[] {1, 90, 51, 87, 98, 2, 10, 5, 2, 99, 34, 42, 1, 0, 57};
		ArrayList array2 = new ArrayList(Arrays.asList(1, 90, 51, 87, 98, 2, 10, 5, 2, 99, 34, 42, 1, 0, 57));
		
		System.out.println(Arrays.toString(Sorts.insertion_sort(array)));
		System.out.println(Sorts.insertion_sort(array2));
	}

}
