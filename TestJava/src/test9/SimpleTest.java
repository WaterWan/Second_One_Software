package test9;

public class SimpleTest {
	public static int getNumber(int i){
		
		if(i == 1){
			return 1;
		}else {
			return i * getNumber(i - 1);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(getNumber(3));
	}
}
