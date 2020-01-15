package com.designprinciples.lsp.example1;

enum BusType {
	SLEEPER,
	SEMISLEEPER,
	SEATER
}

public class Bus extends Vehicle {

	private int maxNumberOfPassengers;
	private BusType busType;
	
	public int getMaxNumberOfPassengers() {
		return maxNumberOfPassengers;
	}
	
	public BusType getBusType() {
		return busType;
	}
	
	public void setMaxNumberOfPassengers(int maxNumberOfPassengers) {
		this.maxNumberOfPassengers = maxNumberOfPassengers;
	}
	
	public void setBusType(BusType busType) {
		this.busType = busType;
	}
	
}