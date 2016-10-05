package test11;

import java.util.ArrayList;
import java.util.List;

public class ListDemo3 {
	public static void main(String[] args) {
		List<String> strList = new ArrayList<>();
		strList.add("a");
		strList.add("b");
		strList.add("c");
		strList.add("d");
		strList.add("e");
		String xString = strList.remove(1);
		System.out.println(xString);
		
		for (int i = 0; i < strList.size(); i++) {
			System.out.println(strList.get(i));
		}
	}
}
