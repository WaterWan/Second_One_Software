package test11;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(134);
		intList.add(123);
		intList.add(113);
		intList.add(1333);
		intList.remove(new Integer(1));
		intList.remove(1);
		for (int i = 0; i < intList.size(); i++) {
			System.out.println(intList.get(i));
		}

	}

}
