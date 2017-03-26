package test25;

public class Question {
	public static void main(String[] args) {
		for (int i = 1; i <= 16; i++) {
			System.out.println(Josephus(i));
		}
	}
	
	public static int Josephus(int number) {
		int survival = 0;
		String binaryString = Integer.toBinaryString(number);
		binaryString = binaryString.substring(1) + binaryString.charAt(0);
		survival = Integer.valueOf(binaryString, 2);
		return survival;
	}
}
