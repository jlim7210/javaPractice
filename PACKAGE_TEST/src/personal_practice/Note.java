package personal_practice;
import java.util.*;

public class Note {
	public static void main(String[] args) {
		int[] array = new int[] {1, 90, 51, 87, 98, 2, 10, 5, 2, 99, 34, 42, 1, 0, 57};
//		mergeSort(array);
		
		
		sort2(array, 0, array.length-1);
		System.out.println(Arrays.toString(array));
	}

	public static void mergeSort(int[] arr) {
		sort(arr, 0, arr.length);
	}
	
	public static void sort(int[] arr, int start, int end) {
		if(end - start < 2) {
			return;
		}
		int mid = (start+end)/2;
		sort(arr, 0, mid);
		sort(arr, mid, end);
		merge(arr, start, mid, end);
	}
	
	public static void merge(int[] arr, int start, int mid, int end) {
		int[] temp = new int[end-start];
		int t=0, l=start, h=mid;
		
		while(l < mid && h < end) {
			if(arr[l] < arr[h]) {
				temp[t++] = arr[l++];
			}else {
				temp[t++] = arr[h++];
			}
		}
		
		while(l < mid) {
			temp[t++] = arr[l++];
		}
		while(h < end) {
			temp[t++] = arr[h++];
		}
		for(int i = start; i<end; i++) {
			arr[i] = temp[i-start];
		}
	}
	
	
	
	
	public static void sort2(int[]arr, int start, int end) {
		if(end-start<2) {
			return;
		}
		if(start < end) {
			int mid = (start+end)/2;
			sort(arr, 0, mid);
			sort(arr, mid, end);
			merge2(arr, start, mid, end);
		}
		
	}
	
	public static void merge2(int[]arr, int start, int mid, int end) {
		int[] temp = new int[arr.length];
		int left = start;
		int right = mid+1;
		int index = left;
		
		while(left<=mid || right<=end) {
			if(right>end || (left<=mid && arr[left]<arr[right])) {
				temp[index++] = arr[left++];
			}else {
				temp[index++] = arr[right++];
			}
		}
		
		for(int i=start; i<end; i++) {
			arr[i] = temp[i];
		}
	}
}
