package strategy.quackbehavior;

public class NoQuackBehavior implements IQuackBehavior {

	@Override
	public void quack() {
		System.out.println("__NoQuack__");
	}

}
