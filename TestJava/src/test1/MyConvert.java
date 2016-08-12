package test1;

public class MyConvert {
	public static void main(String[] args) {
		System.out.println(myInteger2String(200));
	}

	public static String myInteger2String(int i) {
		StringBuilder result = new StringBuilder();
		for (int j = 0; j < 2 - (int) Math.log10(i); j++) {
			result.append("0");
		}
		result.append(Integer.toString(i));
		return result.toString();
	}
}
