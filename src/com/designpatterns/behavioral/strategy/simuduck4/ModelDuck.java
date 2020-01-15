package com.designpatterns.behavioral.strategy.simuduck4;

public class ModelDuck extends Duck {

	public ModelDuck(){
		quackBehavior = new Quack();
		flyBehavior = new FlyNoWay(); // Our Model duck begins life grounded without a way to fly !
	}
	
	@Override
	public void display() {
		System.out.println("I'm a Model Duck");
	}

}
