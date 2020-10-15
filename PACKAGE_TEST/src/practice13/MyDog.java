package practice13;

public class MyDog {
	String name;
	String type;
	
	public MyDog(String str1, String str2) {
		this.name = str1;
		this.type = str2;
	}
	
	public String toString() {
		return type + name;
	}
}
