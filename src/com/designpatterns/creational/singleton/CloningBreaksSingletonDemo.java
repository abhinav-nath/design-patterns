package com.designpatterns.creational.singleton;

class BasicSingleton implements Cloneable {

	public static final BasicSingleton INSTANCE = new BasicSingleton();

	private BasicSingleton() {
		// private constructor
	}
	
	public static BasicSingleton getInstance() {
		return INSTANCE;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException { 
		//return super.clone();  -> this will break Singleton and create a new instance 
		return INSTANCE; // fix
	}
}

public class CloningBreaksSingletonDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		BasicSingleton instance1 = BasicSingleton.getInstance();
		BasicSingleton instance2 = (BasicSingleton) instance1.clone();
		System.out.println("instance1 hashCode:- "+System.identityHashCode(instance1));
		System.out.println("instance2 hashCode:- "+System.identityHashCode(instance2));
	}
}