package practice18;

public class Test_do {
	Do doable() {
		return new Do() {
			@Override
			public void action(String str) {
				System.out.println(str);
			}
		};
	}
	
	public static void main(String[] args) {
		
		//calling and initiating an interface in a class
		new Test_do().doable().action("type1");;
		
		
		
		//interface initiation
		new Do() {

			@Override
			public void action(String str) {
				System.out.println(str);
			}
			
		}.action("type2");;
		
		
		
		//variable declaration and initiation
		Do doa = new Do() {

			@Override
			public void action(String str) {
				System.out.println(str);
			}
			
		};
		doa.action("type3");
	}
}
