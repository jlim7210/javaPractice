package practice13;

public class Member {
	public String name;
	public String job;
	public String address;
	public int age;
	
	public Member() {}
	public Member(int num) {
		this.age = num;
	}
	public Member(String str) {
		this.name = str;
	}
	public Member(int num, String str) {
		this.age = num;
		this.name = str;
	}
	
	void setJob(String str) {
		this.job = str;
	}
	void setAddress(String str) {
		this.address = str;
	}
	public String toString() {
		return name + " " + job + " " + address + " " + age;
	}
}
