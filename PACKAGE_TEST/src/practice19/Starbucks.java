package practice19;

public enum Starbucks {
	ICECOFFEE("아이스커피", 4000),
	AMERICANO("아메리카노", 3500),
	LATE("라떼", 5500),
	TEA("티", 3000);
	
	String name;
	int price;
	
	Starbucks(String str, int num){
		this.name = str;
		this.price = num;
	}
	
	public int get_price() {
		return this.price;
	}
}
