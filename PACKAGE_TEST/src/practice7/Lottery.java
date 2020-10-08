package practice7;
import java.util.*;

public class Lottery {

	public static void main(String[] args) {
		Apple[] appleBox = new Apple[1000];
		
		for(int i=0; i<appleBox.length; i++) {
			appleBox[i] = new Apple();
		}
		
		for(int i=0; i<appleBox.length; i++) {
			int x = i-1;
			appleBox[i].individual_num = (int)(Math.random()*1000+1);
			while(x>-1) {
				if(appleBox[x].individual_num == appleBox[i].individual_num) {
					i--;
					break;
				}
				x--;
			}
		}
		System.out.println(appleBox);
	}
}
