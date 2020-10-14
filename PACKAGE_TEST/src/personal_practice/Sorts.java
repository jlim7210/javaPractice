package personal_practice;

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
	
	//-------------------------------------------------------------
	//-----------------------Merge Sort----------------------------
	//-------------------------------------------------------------
	
	public static void mergeSort(int[] arr) {
        sort(arr, 0, arr.length);
    }

    static void sort(int[] arr, int low, int high) {
        if (high - low < 2) {
            return;
        }

        int mid = (low + high) / 2;
        sort(arr, 0, mid);
        sort(arr, mid, high);
        merge(arr, low, mid, high);
    }

    static void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low];
        int t = 0, l = low, h = mid;

        while (l < mid && h < high) {
            if (arr[l] < arr[h]) {
                temp[t++] = arr[l++];
            } else {
                temp[t++] = arr[h++];
            }
        }

        while (l < mid) {
            temp[t++] = arr[l++];
        }

        while (h < high) {
            temp[t++] = arr[h++];
        }

        for (int i = low; i < high; i++) {
            arr[i] = temp[i - low];
        }
    }
}
