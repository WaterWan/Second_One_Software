package test11;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		List<String> simpleList = new ArrayList<>();
		simpleList.add("123");
		simpleList.add("qwer");
		simpleList.add("You&me");
		simpleList.add("aaa");
		String[] testString = simpleList.toArray(new String[simpleList.size()]);
		for (int i = 0; i < testString.length; i++) {
			System.out.println(testString[i]);
		}
	}
}
