package personal_practice;

import java.util.*;

public class Insertion_sort {
	//O(n^2)
	public static int[] insertion_sort(int[] arr) {
		int j;
		int crrn;
		
		for(int i=0; i<arr.length; i++) {
			j = i-1;
			crrn = arr[i];
			while(j>-1 && crrn<arr[j]) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = crrn;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] array = new int[] {1, 90, 51, 87, 98, 2, 10, 5, 2, 99, 34, 42, 1, 0, 57};
		
		
		
		System.out.println(Arrays.toString(insertion_sort(array)));
	}
}
