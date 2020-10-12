package practice10;
import java.util.Arrays;

public class NameSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String Name = "이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌 ";
		 String[] names = Name.split(",");
		 int tt = 0;
		 for(int i=0; i<names.length; i++) {
			 if(names[i].equals("이재영")) { //자바에서 스트링 비교는 연산자==로는 불가능함
				 tt++;
			 }
		 }
		 
		 System.out.println(tt);
	}

}
