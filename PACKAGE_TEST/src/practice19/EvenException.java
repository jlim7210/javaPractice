package practice19;

public class EvenException extends Exception{
	public String getMessage() {
		return "EvenException: It's an even number.";
	}
}
