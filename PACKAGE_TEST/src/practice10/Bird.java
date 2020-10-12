package practice10;

public class Bird implements Flyable, Landable {

	@Override
	public void GET_FLYING_FUNCTION() {
		System.out.println("Yes I can fly.");
		System.out.println("Bird flying speed is " + Flyable.SPEED*2);
	}

	public void LANDING() {
		System.out.println("Bird landing completed");
	}
}
