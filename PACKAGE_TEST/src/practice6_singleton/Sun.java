package practice6_singleton;

public class Sun {
	private static int mass = 10;
	
	private static Sun sun = new Sun();
	private Sun() {}
	
	public static Sun get_sun() {
		if(sun == null) {
			sun = new Sun();
		}
		return sun;
	}
	
	public static int get_sun_mass() {
		return mass;
	}
}
