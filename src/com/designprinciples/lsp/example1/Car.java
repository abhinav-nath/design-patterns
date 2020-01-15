package com.designprinciples.lsp.example1;

public class Car extends Vehicle {

	private String color;
	private boolean isHatchBack;
	
	public String getColor() {
		return color;
	}
	
	public boolean isHatchBack() {
		return isHatchBack;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setHatchBack(boolean isHatchBack) {
		this.isHatchBack = isHatchBack;
	}
	
	@Override
	public String toString() {
		return "Car [color=" + color + ", isHatchBack=" + isHatchBack + "]";
	}
	
}