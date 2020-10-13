package practice11;

import java.util.ArrayList;
import java.util.Arrays;

public interface Sorts {
	static int[] insertion_sort(int[] array) {
		for(int i=0; i<array.length; i++) {
			int crrn = array[i];
			int inx = i-1;
			while(inx>-1 && crrn < array[inx]) {
				array[inx+1] = array[inx];
				inx--;
			}
			array[inx+1] = crrn;
		}
		return array;
	}
	
	static ArrayList insertion_sort(ArrayList array) {
		for(int i=0; i<array.size(); i++) {
			int crrn = (int)array.get(i);
			int inx = i-1;
			while(inx>-1 && crrn < (int)array.get(inx)) {
				array.set(inx+1, array.get(inx));
				inx--;
			}
			array.set(inx+1, crrn);
		}
		return array;
	}
	
	static int[] merge_sort(int[] array, int start, int end) {
		if(array.length < 2) {
			return array;
		}
		int[] temp = new int[array.length];
		int mid = array.length/2;
		int[] low_array = merge_sort(Arrays.copyOfRange(array, 0, mid));
		int[] high_array = merge_sort(Arrays.copyOfRange(array, mid, array.length));
		
		int[] mergedArray = new int[array.length];
		int m=0, l=0, h=0;
		while(l < low_array.length && h < high_array.length) {
			if(low_array[l] < high_array[h]) {
				mergedArray[m++] = low_array[l++];
			}else {
				mergedArray[m++] = high_array[h++];
			}
		}
		while(l < low_array.length) {
			mergedArray[m++] = low_array[l++];
		}
		while(h < high_array.length) {
			mergedArray[m++] = high_array[h++];
		}
		
		return mergedArray;
	}
}
