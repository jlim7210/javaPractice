package practice3;

public class Apple {
	String name;
	int appleCount;
	
	public Apple() {
		this(1);
	}
	
	public Apple(int num) {
		this.appleCount = num;
	}
	
	public void beEaten() {
		this.appleCount -= 1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAppleCount() {
		return appleCount;
	}

	public void setAppleCount(int appleCount) {
		this.appleCount = appleCount;
	}
}
