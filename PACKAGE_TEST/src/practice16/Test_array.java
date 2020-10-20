package practice16;

import java.util.Arrays;

public class Test_array {

	public static void main(String[] args) {
		int[] array = new int[100];
		for(int i=1; i<=100; i++) {
			array[i-1] = i;
		}
		System.out.println(Arrays.toString(array));
	}

}
