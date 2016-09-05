package dataStru_1;

/**
 * 选择排序
 * 这是一种一步一步挑出最小值的排序算法
 * @author Water
 *
 */
public class SelectSort {
	public void insertSort2(int[] a) {
		int n = a.length;
		for (int i = 0; i < n - 1; i++) {
			// 先假设目前未排序好的第一个数就是最小的
			int min = i;
			for (int j = i + 1; j < n; j++) {
				// 在未排序的数列中找到最小的那个
				if (a[j] < a[min]) {
					min = j;
				}
			}
			int temp = a[i];
			a[i] = a[min];
			a[min] = temp;
			for (int d : a) {
				System.out.print(d + " ");
			}
			System.out.println();
		}
	}
}
