package com.designpatterns.creational.prototype;

public class Tiger implements Animal {
	
	public Tiger() {
		System.out.println("Tiger is made");
	}

	@Override
	public Animal makeCopy() {
		System.out.println("Clone of Tiger is being made");
		
		Tiger tigerObject = null;
		
		try {
			tigerObject = (Tiger) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tigerObject;
	}
	
	public String toString() {
		return "I am a Tiger";
	}

}