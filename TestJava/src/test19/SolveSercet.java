package test19;

public class SolveSercet {
	public static void main(String[] args) {
		for (int i = 1; i <= 26; i++) {
			fun("rjjy rj ts ymj xfggfym bj bnqq inxhzxx ymj uqfs", i);
		}
	}
	
	public static void fun(String secret, int n) {
		char[] ch = secret.toCharArray();
		for(int i = 0; i < ch.length; i++) {
			if(ch[i] == ' ') {
				System.out.print(" ");
				continue;
			}
			ch[i] += n;
			if(ch[i] > 'z') {
				ch[i] -= 26;
			}
			System.out.print(ch[i]);
 		}
		System.out.println();
	}
}
