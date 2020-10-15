package practice13;

import java.util.*;

public class TwentyQuestions {
	static Scanner scanner = new Scanner(System.in);

	public static void number_guess() {
		int price = 1000000;
		
		System.out.println("스무고개 시작! 숫자 1부터 100 사이의 정답을 맞춰보세요.");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("1. 게임시작");
		System.out.println("2. 게임종료");
		System.out.println();
		int select = scanner.nextInt();

		if(select == 2) return;
		else if(select == 1) {
			int num = (int)(Math.random()*100+1);
			String[] guess = null;
			int stack = 0;
			int status = 1;
			
			while(status != 3) {
				switch(status) {
				case 1:
					System.out.println("숫자를 입력하세요.");
					System.out.println("");
					guess = scanner.next().split(",");
					stack+=guess.length;
					status = 2;
				case 2:
					for(String ele : guess) {
						System.out.println();
						if(Integer.parseInt(ele) > num) {
							System.out.println("정답은 "+ele+" 보다 작습니다.");
							status = 1;
						}else if(Integer.parseInt(ele) == num) {
							System.out.println(ele+"가 정답입니다!");
							System.out.println("정답을 "+stack+"회만에 맞추셨습니다.");
							System.out.println("총 상금은 "+(price/stack)+"달러 입니다!");
							System.out.println();
							status = 3;
							break;
						}else if(Integer.parseInt(ele) < num) {
							System.out.println("정답은 "+ele+" 보다 큽니다.");
							status = 1;
						}/*else if(Arrays.List(guess).contains((String)num){
							System.out.println("정답이 없습니다.");
						}
						*/ 
					}
					break;
				}
			}
			number_guess();
		}
	}
	
	public static void main(String[] args) {
		number_guess();
	}

}
