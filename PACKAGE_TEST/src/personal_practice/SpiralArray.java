package personal_practice;
import java.util.ArrayList;
import java.util.Arrays;


public class SpiralArray {

	public static int my_stack = 1;

	public static void go_spiral(int x, int y) {
		int[][] spiral = new int[x][y];
		
		int dir=0;//0정가로 1정세로 2역가로 3역세로
		int i=0, j=0;
		
//		for(i=0;i<x;i++) {
//			for(j=0;j<y;j++) {
//				spiral[i][j] = my_stack;
//				my_stack++;
//			}
//		}
		
		while(x*y > my_stack) {
			switch(dir) {
				case 0:
					if(j<y) {
						spiral[i][j] = my_stack;
						j++;
						my_stack++;
						System.out.println(Arrays.toString(spiral[0]));
						System.out.println(Arrays.toString(spiral[1]));
						System.out.println(Arrays.toString(spiral[2]));
					}else {
						i++;
						j--;
						dir = 1;
					}
					break;
				case 1:
					if(i<x) {
						spiral[i][j] = my_stack;
						i++;
						my_stack++;
						System.out.println(Arrays.toString(spiral[0]));
						System.out.println(Arrays.toString(spiral[1]));
						System.out.println(Arrays.toString(spiral[2]));
					}else {
						i--;
						j--;
						dir = 2;
					}
					break;
				case 2:
					if(j>-1) {
						my_stack++;
					}
			}
		}
		
		System.out.println(my_stack);
	}
	
	public static void main(String[] args) {
		go_spiral(3,3);
	}

}
