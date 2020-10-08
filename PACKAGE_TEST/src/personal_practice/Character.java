package personal_practice;

public class Character {
	private static Stat stat;
	private static int char_class;
	
	
	public static Stat getStat() {
		return stat;
	}
	public static void set_stat(Stat stat) {
		Character.stat = stat;
	}
	public static int getChar_class() {
		return char_class;
	}
	public static void setChar_class(int char_class) {
		Character.char_class = char_class;
	}
	
}
