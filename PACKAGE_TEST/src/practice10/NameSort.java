package practice10;
import java.util.Arrays;

public class NameSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String Name = "������,���翵,����ǥ,���翵,�ڹ�ȣ,������,���翵,������,�ֽ���,�̼���,�ڿ���,�ڹ�ȣ,������,����ȯ,���缺,������,������ ";
		 String[] names = Name.split(",");
		 int tt = 0;
		 for(int i=0; i<names.length; i++) {
			 if(names[i].equals("���翵")) { //�ڹٿ��� ��Ʈ�� �񱳴� ������==�δ� �Ұ�����
				 tt++;
			 }
		 }
		 
		 System.out.println(tt);
	}

}
