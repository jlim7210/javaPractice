package practice8;

public class Test_Ball {

	public static void main(String[] args) {
		BaseballBall yagu = new BaseballBall(5, "white");
		BasketballBall nong_gu = new BasketballBall(15, "brown");
		
		System.out.println(yagu.color);
		System.out.println(yagu.size);
		System.out.println(yagu.brands.get(0));
		System.out.println(nong_gu.color);
		System.out.println(nong_gu.size);
		System.out.println(nong_gu.brands.get(0));
	}

}
