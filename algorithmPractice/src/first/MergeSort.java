package first;

import java.util.ArrayList;

public class MergeSort {
	
	public void merge(ArrayList<Integer> v, int s, int e, int m) {
		int i = s;
		int j = m+1;
		int copy = 0;
		
		while(i <= m && j <= e) {
			if(v.get(i) < v.get(j)) {
				i++;
				
			}else if(v.get(i) > v.get(j)) {
				j++;
			}
		}
	}
	
	public static void main(String[] args) {
		
	}
}
