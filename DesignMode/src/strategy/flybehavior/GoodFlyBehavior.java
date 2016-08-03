package strategy.flybehavior;

public class GoodFlyBehavior implements IFlyBehavior {

	@Override
	public void fly() {
		System.out.println("--GoodFly--");
	}

}