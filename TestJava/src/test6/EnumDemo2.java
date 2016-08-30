package test6;

public class EnumDemo2 {
	public static void main(String[] args) {
		Apple apple;
		System.out.println("All apple constants");
		for (Apple a: Apple.values()) {
			System.out.println(a);
		}
		System.out.println();
		
		apple = Apple.valueOf("Winesap");
		System.out.println("apple contains " + apple);
	}
}
