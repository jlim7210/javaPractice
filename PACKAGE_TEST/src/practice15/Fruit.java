package practice15;

public class Fruit {
	int id;
	String origin;
	
	
	public String toString() {
		return "�� ������ ���̵�� "+this.id+"�̰� �������� "+this.origin+"�Դϴ�.";
	}
	
	public int hashCode() {
		return this.id;
	}
}
