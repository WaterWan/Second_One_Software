package test18;

public class ExtendMethodTest1 {
	public void testTwoMethod() {
		System.out.println("父类中的方法，调用其他方法");
		testTwoMethod1();
	}
	
	public void testTwoMethod1() {
		System.out.println("父类中的方法，被其他方法调用");
	}
}
