package test8;

public class Test {
	public static int getNumber(int i) {
		int result = 0;
		String tempStr = Integer.toUnsignedString(i, 4);
		char[] tempChar = tempStr.toCharArray();
		for (int j = 0; j < tempChar.length; j++) {
			result *= 10;
			result += (int)Math.pow(tempChar[j] - '0', 2);
		}
		return result;
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			System.out.println(getNumber(i));
			
		}
		
	}
	

}
