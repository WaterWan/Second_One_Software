package dataStru_1;
/**
 * 插入排序
 * 这是一种跟抓牌差不多的排序算法
 * @author Water
 *
 */
public class InsertSort {
	public static int[] data = { 12, 10, 9, 20, 6, 31, 24 };

	/**
	 * @param data
	 */
	public void insertSort(int[] data) {
		int n = data.length;
		// 只有一个数的时候是不需要排序的，因此从下标为1的数开始排
		for (int i = 1; i < n; i++) {
			int temp = data[i];
			int j = i - 1;
			// 将需要插入的数找到合适的位置
			while(j >= 0 && temp < data[j]){
				data[j+1] = data[j];
				j--;
			}
			j++;
			data[j] = temp;
			for (int d : data) {
				System.out.print(d + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		for (int d : data) {
			System.out.print(d + " ");
		}
		System.out.println();
		InsertSort ss = new InsertSort();
		ss.insertSort(data);
		
	}
}
