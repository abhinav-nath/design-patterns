package com.designpatterns.creational.prototype;

public class Sheep implements Animal {
	
	public Sheep() {
		System.out.println("Sheep is made");
	}

	@Override
	public Animal makeCopy() {
		System.out.println("Clone of Sheep is being made");
		
		Sheep sheepObject = null;
		
		try {
			sheepObject = (Sheep) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sheepObject;
	}
	
	public String toString() {
		return "Dolly is my hero, Baaaa!";
	}

}