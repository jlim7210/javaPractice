package practice13;

import java.lang.reflect.*;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class chk0 = new Member(1, "1").getClass();
		Class chk1 = Class.forName("practice13.Member");
		Constructor[] chk2 = chk1.getConstructors();
		Field[] chk3 = chk1.getFields();
		Method[] chk4 = chk1.getMethods();
		Class chk5 = chk1.getSuperclass();
		Class[] chk6 = chk1.getInterfaces();
		
		Class mClass = Class.forName("practice13.Member");
		Member m2 = (Member)mClass.newInstance();
		m2.name = "joon";
		m2.address = "home address";
		m2.age = 10;
		m2.job = "student";
		
		System.out.println(new Member(1, "baby").toString());
		System.out.println(chk0);
		System.out.println();
		System.out.println(chk1);
		System.out.println();
		System.out.println(Arrays.toString(chk2));
		System.out.println();
		System.out.println(Arrays.toString(chk3));
		System.out.println();
		System.out.println(Arrays.toString(chk4));
		System.out.println();
		System.out.println(chk5);
		System.out.println();
		System.out.println(Arrays.toString(chk6));
		System.out.println();
		System.out.println(m2.toString());
		
	}

}
