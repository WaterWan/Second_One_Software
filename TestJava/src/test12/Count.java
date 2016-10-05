package test12;

public class Count {
	public static void main(String[] args) {
		int n = 10;
		int count = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				for (int k = 1; k <= j; k++) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
