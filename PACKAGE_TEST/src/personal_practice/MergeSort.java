package personal_practice;
import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] array = new int[] {1, 90, 51, 87, 98, 2, 10, 5, 2, 99, 34, 42, 1, 0, 57};
		int [] src = new int[]{1, 9, 8, 5, 4, 2, 3, 7, 6};
		
//		mergeSort(array, 0, array.length-1);
		System.out.println(Arrays.toString(sort(array)));
//		mergeSort(array, 0, array.length-1);
//		System.out.println(Arrays.toString(array));
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
	}
	
	public static int[] sort(int[] arr) {
        if (arr.length < 2) return arr;

        int mid = arr.length / 2;
        int[] low_arr = sort(Arrays.copyOfRange(arr, 0, mid));
        int[] high_arr = sort(Arrays.copyOfRange(arr, mid, arr.length));

        int[] mergedArr = new int[arr.length];
        int m = 0, l = 0, h = 0;
        while (l < low_arr.length && h < high_arr.length) {
            if (low_arr[l] < high_arr[h])
                mergedArr[m++] = low_arr[l++];
            else
                mergedArr[m++] = high_arr[h++];
        }
        while (l < low_arr.length) {
            mergedArr[m++] = low_arr[l++];
        }
        while (h < high_arr.length) {
            mergedArr[m++] = high_arr[h++];
        }
        return mergedArr;
    }
}
