package practice8;

public class Me extends Family{
	public String name;
	
	public Me() {}
	public Me(String name) {
		this.name = name;
	}
	public Me(char fN, String name) {
		super.familyName = fN;
		this.name = super.familyName + name;
	}
}
