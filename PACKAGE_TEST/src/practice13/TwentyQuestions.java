package practice13;

import java.util.*;

public class TwentyQuestions {
	static Scanner scanner = new Scanner(System.in);

	public static void number_guess() {
		int price = 1000000;
		
		System.out.println("������ ����! ���� 1���� 100 ������ ������ ���纸����.");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("1. ���ӽ���");
		System.out.println("2. ��������");
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
					System.out.println("���ڸ� �Է��ϼ���.");
					System.out.println("");
					guess = scanner.next().split(",");
					stack+=guess.length;
					status = 2;
				case 2:
					for(String ele : guess) {
						System.out.println();
						if(Integer.parseInt(ele) > num) {
							System.out.println("������ "+ele+" ���� �۽��ϴ�.");
							status = 1;
						}else if(Integer.parseInt(ele) == num) {
							System.out.println(ele+"�� �����Դϴ�!");
							System.out.println("������ "+stack+"ȸ���� ���߼̽��ϴ�.");
							System.out.println("�� ����� "+(price/stack)+"�޷� �Դϴ�!");
							System.out.println();
							status = 3;
							break;
						}else if(Integer.parseInt(ele) < num) {
							System.out.println("������ "+ele+" ���� Ů�ϴ�.");
							status = 1;
						}/*else if(Arrays.List(guess).contains((String)num){
							System.out.println("������ �����ϴ�.");
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
