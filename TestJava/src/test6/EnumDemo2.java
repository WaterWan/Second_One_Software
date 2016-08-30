package test6;

public class EnumDemo2 {
	public static void main(String[] args) {
		Apple apple;
		System.out.println("All apple prices");
		for (Apple a: Apple.values()) {
			System.out.println(a + " " + a.getPrice());
		}
		System.out.println();
		
		apple = Apple.valueOf("Winesap");
		System.out.println("Winesap price " + apple.getPrice());
	}
}
