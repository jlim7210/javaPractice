package practice10;

public class Apple extends Fruit{

	@Override
	int check_sweetness() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	String check_brand() {
		// TODO Auto-generated method stub
		return "Delmont";
	}

	@Override
	public void SAFE_TO_EAT() {
		// TODO Auto-generated method stub
		System.out.println("Yes");
	}
	
}
