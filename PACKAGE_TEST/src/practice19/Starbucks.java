package practice19;

public enum Starbucks {
	ICECOFFEE("���̽�Ŀ��", 4000),
	AMERICANO("�Ƹ޸�ī��", 3500),
	LATE("��", 5500),
	TEA("Ƽ", 3000);
	
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
