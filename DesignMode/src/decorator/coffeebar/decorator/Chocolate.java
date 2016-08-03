package decorator.coffeebar.decorator;

import decorator.coffeebar.Drink;

public class Chocolate extends Decorator {

	public Chocolate(Drink Obj) {
		super(Obj);
		super.setDescription("Chocolate");
		super.setPrice(3.0f);
	}

}
