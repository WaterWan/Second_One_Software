package strategy.flybehavior;

public class BadFlyBehavior implements IFlyBehavior {
	@Override
	public void fly() {
		System.out.println("--BadFly--");
	}
}
