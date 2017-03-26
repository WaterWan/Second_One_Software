package test25;

import java.util.Random;

public class ChooseBook {
	public static void main(String[] args) {
		Random randomBook = new Random();
		int bookNum = randomBook.nextInt();
		System.out.println(bookNum);
	}
}
