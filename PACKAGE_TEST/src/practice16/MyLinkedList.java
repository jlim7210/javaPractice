package practice16;

import java.util.*;

public class MyLinkedList<T> {
	ArrayList<Object[]> array = new ArrayList<Object[]>();
	
	public void add(int num, T ele) {
		Object[] vAndA = new Object[2];
		vAndA[0] = ele;
		vAndA[1] = null; //next address
		if(num == array.size()) {
			ArrayList<Object[]> arrayTemp = new ArrayList<Object[]>();
			arrayTemp.addAll(array);
			arrayTemp.add(vAndA);
			arrayTemp.get(num-1)[1] = vAndA.hashCode();
			array = arrayTemp;
		}else if(num == 0){
			ArrayList<Object[]> arrayTemp = new ArrayList<Object[]>();
			vAndA[1] = array.get(0).hashCode();
			arrayTemp.add(vAndA);
			arrayTemp.addAll(array);
			array = arrayTemp;
		}else {
			ArrayList<Object[]> arrayTemp = new ArrayList<Object[]>();
			vAndA[1] = array.get(num).hashCode();
			array.get(num-1)[1] = vAndA.hashCode();
			for(int i = 0; i<num; i++) {
				arrayTemp.add(array.get(i));
			}
			arrayTemp.add(vAndA);
			for(int i = arrayTemp.size()-1;i<array.size(); i++) {
				arrayTemp.add(array.get(i));
			}
			array = arrayTemp;
		}
	}
	
	public void add(T ele) {
		Object[] vAndA = new Object[2];
		vAndA[0] = ele;
		vAndA[1] = null;
		if(array.size() == 0) {
			array.add(vAndA);
		}else {
			array.get(array.size()-1)[1] = vAndA.hashCode();
			array.add(vAndA);
		}
	}

}
