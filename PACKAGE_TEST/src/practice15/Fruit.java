package practice15;

public class Fruit {
	int id;
	String origin;
	
	
	public String toString() {
		return "이 과일의 아이디는 "+this.id+"이고 원산지는 "+this.origin+"입니다.";
	}
	
	public int hashCode() {
		return this.id;
	}
}
