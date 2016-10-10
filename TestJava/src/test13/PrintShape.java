package test13;

public class PrintShape {
	
	public static void printStars(int num) {
		for (int i = 0; i < num; i++) {
			System.out.print("*");
		}
	}
	
	public static void printSpace(int num) {
		for (int i = 0; i < num; i++) {
			System.out.print(" ");
		}
	}
	
	public static void printRhombus(int num) {
		for (int i = num; i > 0; i--) {
			printSpace(i - 1);
			printStars(2 * (num - i) + 1);
			System.out.println();
		}
		for (int i = 2; i <= num; i++) {
			printSpace(i - 1);
			printStars(2 * (num - i) + 1);
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		printRhombus(3);
	}
}
