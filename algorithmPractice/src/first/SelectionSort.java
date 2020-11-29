package first;

import java.util.ArrayList;
import java.util.Arrays;

public class SelectionSort {

	public static int[] arr = {2, 5, 6, 4, 2, 9, 1, 1, 0, 6, 7, 5, 4, 8, 3};
	
	public static void main(String[] args) {
		for(int i=0; i<arr.length-1; i++) {
			int temp = i;
			int temp2 = 0;
			for(int x=i+1; x<arr.length; x++) {
				if(arr[i]>arr[x]) temp = x;
			}
			if(temp != i) {
				temp2 = arr[i];
				arr[i] = arr[temp];
				arr[temp] = temp2;
				i--;
			}
			System.out.println(Arrays.toString(arr));
		}
	}

}
