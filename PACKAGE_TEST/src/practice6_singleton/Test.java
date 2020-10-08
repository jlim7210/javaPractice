package practice6_singleton;

public class Test {
	public static void main(String[] args) {
//		Sun sun1 = new Sun(); 접근자 private Not visible 확인 <- 확인용 오류코드!
		Sun.get_sun();
//		Sun멤버변수 mass가 스태틱 변수가 아닌 멤버 변수일 경우 -> 외부 클래스에서 값 변경 가능. (non-singleton)
//		System.out.println(Sun.get_sun().mass);
//		Sun.get_sun().mass = 20;
//		System.out.println(Sun.get_sun().mass);
		System.out.println(Sun.get_sun_mass());
	}
}
