package test2;

public class VarArgs {

	public static void main(String[] args) {
		System.out.println(getAverage());
		System.out.println(getAverage(10.1, 22, 34, 56));
		System.out.println(getAverage(100));
	}

	public static double getAverage(double ... nums) {
		double sum = 0.0;
		if(nums.length == 0){
			return 0;
		}
		for (double d : nums) {
			sum += d;
		}
		return sum / nums.length;
	}
}
