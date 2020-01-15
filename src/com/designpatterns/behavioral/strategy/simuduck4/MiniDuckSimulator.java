package com.designpatterns.behavioral.strategy.simuduck4;

import com.designpatterns.behavioral.strategy.simuduck4.FlyRocketPowered;

public class MiniDuckSimulator {

	public static void main(String[] args) {

		Duck mallard = new MallardDuck();
		mallard.display();
		mallard.performQuack();
		mallard.performFly();
		mallard.swim();

		System.out.println();

		Duck redhead = new RedHeadDuck();
		redhead.display();
		redhead.performQuack();
		redhead.performFly();
		redhead.swim();

		System.out.println();

		Duck rubberDuck = new RubberDuck();
		rubberDuck.display();
		rubberDuck.performQuack(); // A Rubber Duck is not supposed to fly !!
		rubberDuck.performFly(); // A Rubber Duck doesn't quack, it squeeks !!
		rubberDuck.swim();

		System.out.println();

		Duck modelDuck = new ModelDuck();
		modelDuck.display();
		modelDuck.performQuack();
		modelDuck.swim();
		modelDuck.performFly();
		modelDuck.setFlyBehavior(new FlyRocketPowered());
		modelDuck.performFly();
	}

}
