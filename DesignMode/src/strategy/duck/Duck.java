package strategy.duck;

import strategy.flybehavior.IFlyBehavior;
import strategy.quackbehavior.IQuackBehavior;

public abstract class Duck {

	IFlyBehavior mFlyBehavior;
	IQuackBehavior mQuackBehavior;

	public Duck() {

	}

	public void Fly() {
		mFlyBehavior.fly();
	}

	public void Quack() {
		mQuackBehavior.quack();
	}

	public abstract void display();

	public void SetQuackBehavoir(IQuackBehavior qb) {
		mQuackBehavior = qb;
	}

	public void SetFlyBehavoir(IFlyBehavior fb) {
		mFlyBehavior = fb;
	}

	public void swim() {
		System.out.println("~~im swim~~");
	}
}
