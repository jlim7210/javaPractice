package practice10;

public class Airplane implements Flyable, Landable {

	@Override
	public void GET_FLYING_FUNCTION() {
		System.out.println("Yes I can fly.");
		System.out.println("Airplane flying speed is " + Flyable.SPEED*100);
	}

	@Override
	public void LANDING() {
		System.out.println("Airplane landing completed");
	}

}
