package test1;

public class ContinueLabel {
	public static void main(String[] args) {
		outer: for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (j > i) {
					System.out.println();
					continue outer;
//					break;
					// 你会发现这里的continue语句和break起到了相同的作用
				}
				System.out.print(" " + (i * j) + "\t");
			}
		}
		System.out.println();
	}
}
