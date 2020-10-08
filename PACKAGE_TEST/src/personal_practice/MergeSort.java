package personal_practice;
import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] array = new int[] {1, 90, 51, 87, 98, 2, 10, 5, 2, 99, 34, 42, 1, 0, 57};
		int [] src = new int[]{1, 9, 8, 5, 4, 2, 3, 7, 6};
		
		mergeSort(src, 0, src.length-1);
	}

	public static void mergeSort(int[] arr, int start, int end) {
		int[] temp = new int[arr.length];
		if(start < end) {
			int mid = (start+end)/2;
			mergeSort(arr, start, mid);
			mergeSort(arr, mid+1, end);
			
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
		System.out.println(Arrays.toString(arr));
	}
}
