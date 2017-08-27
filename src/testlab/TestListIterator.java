package testlab;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("1");
		arrayList.add("2");
		arrayList.add("3");
		arrayList.add("4");
		arrayList.add("5");
		ListIterator<String> iterator = arrayList.listIterator();
		for(int i=0;i<5;i++){
			String pStr = iterator.next();
			if(i == 2){
				System.out.println(pStr);
				iterator.remove();
				iterator.add("new");
			}
		}
		System.out.println(arrayList);
	}

}
