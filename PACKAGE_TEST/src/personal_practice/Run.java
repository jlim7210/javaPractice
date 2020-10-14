package personal_practice;

import java.util.*;

public class Run {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		//JAVA stands for Java Assisted Virtual Adventure
		System.out.println("턴제 게임 JAVA에 오신 것을 환영합니다. 캐릭터를 골라주세요.");
		System.out.println("1: 전사 / 2: 마법사");
		int char_class = scan.nextInt();
		if(char_class == 1) {
			System.out.println("전사를 선택했습니다.");
			Character.setChar_class(1);
			Stat your_stat = new Stat();
			your_stat.setAtk(10);
			your_stat.setWit(1);
			your_stat.setDef(15);
			your_stat.setMr(2);
			your_stat.setMax_hp();
			your_stat.setMax_mp();
			your_stat.setSpeed(5);
			Character.set_stat(your_stat);
		}else {
			System.out.println("마법사를 선택했습니다.");
			Character.setChar_class(1);
			Stat your_stat = new Stat();
			your_stat.setAtk(5);
			your_stat.setWit(15);
			your_stat.setDef(6);
			your_stat.setMr(12);
			your_stat.setMax_hp();
			your_stat.setMax_mp();
			your_stat.setSpeed(3);
			Character.set_stat(your_stat);
		}
	}
}
