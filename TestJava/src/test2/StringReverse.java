package test2;

public class StringReverse {
	public static String reverse(String str) {
		StringBuilder stringBuilder = new StringBuilder(str);
		return stringBuilder.reverse().toString();
	}
	
	public static void main(String[] args) {
		System.out.println(reverse("HelloWorld!"));
	}
}
