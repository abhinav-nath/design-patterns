package com.designprinciples.lsp.example1;

public class Vehicle {
	
	private int speed;
	private int cubicCapacity;
	
	public int getSpeed() {
		return speed;
	}
	
	public int getCubicCapacity() {
		return cubicCapacity;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void setCubicCapacity(int cubicCapacity) {
		this.cubicCapacity = cubicCapacity;
	}
	
	@Override
	public String toString() {
		return "Vehicle [speed=" + speed + ", cubicCapacity=" + cubicCapacity + "]";
	}
	
}