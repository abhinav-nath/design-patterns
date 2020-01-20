package com.designpatterns.creational.abstractfactory.example2.side;

public class CrispyCorn implements Side {
	
	private String sideName = null;

	@Override
	public void setSideName() {
		sideName = "Crispy Corn";
	}

	@Override
	public String getSideName() {
		return sideName;
	}
	
}