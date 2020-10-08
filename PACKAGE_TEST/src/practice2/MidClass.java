package practice2;

public class MidClass {
	private String name;
	private int idNum;
	private SmlClass smallClass;
	
	public MidClass(SmlClass input) {
		this.smallClass = input;
	}
	
	public MidClass() {
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIdNum() {
		return idNum;
	}
	public void setIdNum(int idNum) {
		this.idNum = idNum;
	}
	public SmlClass getSmallClass() {
		return smallClass;
	}
	public void setSmallClass(SmlClass smallClass) {
		this.smallClass = smallClass;
	}
	
	
}
