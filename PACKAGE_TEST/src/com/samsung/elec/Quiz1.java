package com.samsung.elec;

public class Quiz1 {

	
	public static boolean function1 (int input) {
		return (input%2 == 0)? true:false;
	}
	
	public static boolean function2 (String str) {
		return (str.length() > 10)? true:false;
	}
	
	public static void main(String[] args) {
		System.out.println(function1(9));
		System.out.println(function2("Hello Java I'm a student."));
	}
}
