package practice16;

import java.util.ArrayList;

public class Stack {
	ArrayList<String> array = new ArrayList<String>();
	
	public void push(String str) {
		array.add(str);
	}
	
	public String pop() {
		if(array.size()<1) {
			return null;
		}else {
			return(array.remove(array.size()-1));
		}
	}
}
