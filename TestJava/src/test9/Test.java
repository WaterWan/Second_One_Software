package test9;

public class Test {

	public static void main(String[] args) {
		int[] a = new int[9];
		int[] test = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(getMul(test));
		System.out.println(getSum(test));
		for (a[0] = 1; a[0] <= 9; a[0]++) {
			for (a[1] = a[0]; a[1] <= 9; a[1]++) {
				for (a[2] = a[1]; a[2] <= 9; a[2]++) {
					for (a[3] = a[2]; a[3] <= 9; a[3]++) {
						for (a[4] = a[3]; a[4] <= 9; a[4]++) {
							for (a[5] = a[4]; a[5] <= 9; a[5]++) {
								for (a[6] = a[5]; a[6] <= 9; a[6]++) {
									for (a[7] = a[6]; a[7] <= 9; a[7]++) {
										for (a[8] = a[7]; a[8] <= 9; a[8]++) {
											if (getSum(a) == 45 && getMul(a) == 362880) {
												showResult(a);
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println("END");

	}

	public static int getSum(int[] a) {
		int result = 0;
		for (int i : a) {
			result += i;
		}
		return result;
	}

	public static int getMul(int[] a) {
		int result = 1;
		for (int i : a) {
			result *= i;
		}
		return result;
	}

	public static void showResult(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

}
