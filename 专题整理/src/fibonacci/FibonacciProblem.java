package fibonacci;
/**
 * Fibonacci :0,1,1,2,
 * @author Water
 *
 */
public class FibonacciProblem {
	/**
	 * 普通的递归
	 * @param n
	 * @return
	 */
	public static int Fibonacci(int n) {
		if (n < 2) {
			return n;
		}
		return Fibonacci(n - 1) + Fibonacci(n - 2);
	}
	/**
	 * 尾递归
	 * 递归调用返回的结果总被直接返回
	 * 想求第n项，则调用Fibonacci(n, 0, 1)
	 * @param n
	 * @param ret1
	 * @param ret2
	 * @return
	 */
	public static int Fibonacci(int n, int ret1, int ret2) {
		if (n == 0) {
			return ret1;
		}else {
			return Fibonacci(n - 1, ret2 , ret2 + ret1);
		}
	}
	/**
	 * 使用迭代求
	 * 其实就是循环
	 * @param n
	 * @return
	 */
	public static int Fibonacci_iteration(int n) {
		int num[] = {0, 1, 1};
		if (n < 3) {
			return num[n];
		}
		for (int i = n; i > 2; i--) {
			num[0] = num[2];
			num[2] = num[0] + num[1];
			num[1] = num[0];
		}
		return num[2];
	}
	
	public static void main(String[] args) {
		int num = 32;
		int ret1 = 0;
		int ret2 = 1;
		System.out.println(Fibonacci(num));
		System.out.println(Fibonacci(num, ret1, ret2));
		System.out.println(Fibonacci_iteration(num));
		int temp = 3;
		System.out.println(Fibonacci(temp-2) - Fibonacci(temp) + 2);
	}
	
}
