package practice13;

import java.util.Scanner;

public class StringToInteger {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("input the first value");
		String str = scanner.next();
		System.out.println("input the second value");
		String str2 = scanner.next();
		
		System.out.println(str + " + " + str2 + " = " + (Integer.valueOf(str) + Integer.valueOf(str2)));
	}
	
}
