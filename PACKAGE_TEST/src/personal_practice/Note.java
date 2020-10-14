package personal_practice;
import java.util.*;

public class Note implements Sorts{
	
	public static void main(String[] args) {
		int[] array = new int[] {1, 90, 51, 87, 98, 2, 10, 5, 2, 99, 34, 42, 1, 0, 57};
		Sorts.mergeSort(array);
		System.out.println(Arrays.toString(array));
	}
}
