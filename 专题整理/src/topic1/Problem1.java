package topic1;

public class Problem1 {
	/**
	 * 题目要求：
	 * 给出两个32位的整数N和M，以及两个二进制位的位置i和j。
	 * 写一个方法来使得N中的第i到j位等于M（M会是N中从第i位开始到第j位的子串）。
	 * http://www.lintcode.com/zh-cn/problem/update-bits/
	 * 解：
	 * 最右边为第0位，最左边为第31位
	 * i < j
	 * 即N的[i, j]位为M的二进制表示
	 * @param N, M: Two integer
	 * @param i, j: Two bit positions
	 * @return result: An integer
	 */
	public static int updateBits(int N, int M, int i, int j) {
		int result = 0;
		System.out.println("N in 2mod is " + Integer.toBinaryString(N));
		System.out.println("M in 2mod is " + Integer.toBinaryString(M));
		
		// 首先，构造一个从i到j位都是1，其他位都是0的数
		// 这里的实现细节并没有什么关系，只要能实现就好了，就比如这里注释掉的也是一种实现
		int temp = -1;
		System.out.println(Integer.toBinaryString(temp));
//		temp <<= (31 - j);
//		System.out.println(Integer.toBinaryString(temp));
//		temp >>>= (31 - j + i);
//		System.out.println(Integer.toBinaryString(temp));
//		temp <<= i;
//		System.out.println(Integer.toBinaryString(temp));
		temp <<= (32 - j + i);
		System.out.println(Integer.toBinaryString(temp));
		temp >>>= (32 - j);
		System.out.println(Integer.toBinaryString(temp));
		// 其次，将这个数取反，即变成从i到j位都是0，其他位都是1的数
		temp = ~temp;
		System.out.println(Integer.toBinaryString(temp));
		// 接着，将这个数与N取与运算，使得N的第i到j位都是0，其他位不变
		N &= temp;
		System.out.println(Integer.toBinaryString(N));
		// 最后，将N与M左移i位进行或运算，使得N的第i到j位刚好为M
		N |= (M << i);
		System.out.println(Integer.toBinaryString(N));
		return result;
	}
	
	public static void main(String[] args) {
		int N = 255;
		int M = 10;
		int i = 3;
		int j = 6;
		updateBits(N, M, i, j);
	}
}
