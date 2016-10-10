package test13;

public class PrintShape {
	
	public static void main(String[] args) {
		
		for (int i = 1; i <= 6; i++) {
			System.out.println(i);
			printRhombus(i);
			System.out.println();
		}
	}
	
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
		if(num % 2 == 1) {
			printOddRhombus(num / 2 + 1);
		}else {
			printEvenRhombus(num / 2);
		}
	}
	
	public static void printOddRhombus(int num) {
		printPositiveTriangle(num);
		for (int i = 2; i <= num; i++) {
			printSpace(i - 1);
			printStars(2 * (num - i) + 1);
			System.out.println();
		}
	}
	
	public static void printEvenRhombus(int num) {
		printPositiveTriangle(num);
		for (int i = 1; i <= num; i++) {
			printSpace(i - 1);
			printStars(2 * (num - i) + 1);
			System.out.println();
		}
	}
	
	public static void printPositiveTriangle(int num) {
		for (int i = num; i > 0; i--) {
			printSpace(i - 1);
			printStars(2 * (num - i) + 1);
			System.out.println();
		}
	}
	
}
