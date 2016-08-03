package strategy.flybehavior;

public class NoFlyBehavior implements IFlyBehavior {
	@Override
	public void fly() {
		System.out.println("--NoFly--");
	}
}
