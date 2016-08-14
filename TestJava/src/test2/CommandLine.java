package test2;

public class CommandLine {
	public static void main(String args[]) {
		System.out.println("Start");
		for (int i = 0; i < args.length; i++) {
			System.out.println("args[" + i + "]: " + args[i]);
		}
		System.out.println("Stop");
	}
}
