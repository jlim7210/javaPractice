package practice17;

public class Apple implements Comparable<Apple>{
	int serial;
	int create_date;
	
	public Apple(int ser, int date) {
		this.serial = ser;
		this.create_date = date;
	}
	
	public String toString() {
		return "시리얼 코드는 "+serial+" 제조 날짜는 "+create_date+"입니다.";
	}
	
	public int hashCode() {
		return this.serial; 
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Apple) {
			if(this.serial == ((Apple)obj).serial) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@Override
	public int compareTo(Apple o) {
		// TODO Auto-generated method stub
		return this.serial - o.serial;
	}
	
	
}
