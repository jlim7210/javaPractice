package personal_practice;
import java.util.*;

public class Quiz1 {
	
	public static int one_to_ten(){
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum += i;
		}
		return sum;
	}
	
	public static int one_to_ten_even() {
		int sum = 0;
		for(int i=1; i<=10; i++) {
			if(i%2==0) {
				sum += i;
			}
		}
		return sum;
	}
	
	public static void star() {
		for(int i=1; i<6; i++) {
			for(int x=0; x<i; x++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static int[] one_to_hundred() {
		int[] array = new int[100];
		for(int i=0; i<array.length; i++) {
			array[i] = i+1;
		}
		return array;
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(one_to_hundred()));
		System.out.println(one_to_ten());
		System.out.println(one_to_ten_even());
		star();
		
	}
}
