package test17;

import java.util.Set;
import java.util.TreeSet;

public class Generator {
	
	public static final String numbersAndChars = "1234567890QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm";

	public static void main(String[] args) {
		int maxNumber = 200;
		Set set = new TreeSet<String>();
		int strSize = numbersAndChars.length();
		String result;
		int lengthOfGoal = 20;
		while (set.size() < maxNumber) {
			result = "";
			for(int i = 0; i < lengthOfGoal; i++) {
				result += numbersAndChars.charAt((int)(Math.random() * strSize));
			}
			if(!set.contains(result)) {
				set.add(result);
			}
		}
		int count = 0;
		for(Object o : set) {
			count ++;
			System.out.println((String)o + "  " + count);
		}
	}

}
