package practice19;

import java.util.*;

public class Test_exception {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("input a number: ");
			boolean user_input = (sc.nextInt()%2 == 0) ? true:false;
			
			if(user_input) throw new EvenException();
			else throw new OddException();
		}catch(EvenException e) {
			System.out.println(e.getMessage());
		}catch(OddException e) {
			System.out.println(e.getMessage());
		}catch(InputMismatchException e) {
			System.out.println("Please input an int value.");
		}
	}

}
