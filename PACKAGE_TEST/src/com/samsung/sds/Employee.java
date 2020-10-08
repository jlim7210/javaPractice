package com.samsung.sds;

public class Employee {
	String name;
	
	void setName(String name) {
		this.name = name;
	}
	
	String getName() {
		return name;
	}
	
	int add(int num1, int num2) {
		return num1 + num2;
	}
	
	String example(String input, int num) {
		if(num >= 10) {
			return input;
		}else {
			return "error";
		}
	}
}
