package practice6_singleton;

public class Test {
	public static void main(String[] args) {
//		Sun sun1 = new Sun(); ������ private Not visible Ȯ�� <- Ȯ�ο� �����ڵ�!
		Sun.get_sun();
//		Sun������� mass�� ����ƽ ������ �ƴ� ��� ������ ��� -> �ܺ� Ŭ�������� �� ���� ����. (non-singleton)
//		System.out.println(Sun.get_sun().mass);
//		Sun.get_sun().mass = 20;
//		System.out.println(Sun.get_sun().mass);
		System.out.println(Sun.get_sun_mass());
	}
}
