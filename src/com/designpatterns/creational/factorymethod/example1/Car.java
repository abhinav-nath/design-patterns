package com.designpatterns.creational.factorymethod.example1;

public abstract class Car {

	private CarType model = null;

	public Car(CarType model) {
		this.model = model;
		arrangeParts();
	}
	
	public CarType getModel() {
        return model;
    }
 
    public void setModel(CarType model) {
        this.model = model;
    }

	private void arrangeParts() {
		// Do one time processing here
	}

	// Do subclass level processing in this method
	protected abstract void construct();
}