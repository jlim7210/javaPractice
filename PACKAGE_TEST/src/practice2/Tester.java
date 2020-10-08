package practice2;

public class Tester {
	public static void main(String[] args) {
		SmlClass id1 = new SmlClass();
		id1.setName("John Preston");
		id1.setIdNum(000000);
		
		MidClass eqilibrium = new MidClass(id1);
		System.out.println(eqilibrium.getSmallClass().getName());
	}
}
