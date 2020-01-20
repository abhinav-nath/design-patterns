package com.designpatterns.creational.abstractfactory.example2;

import com.designpatterns.creational.abstractfactory.example2.drink.Drink;
import com.designpatterns.creational.abstractfactory.example2.maincourse.MainCourse;
import com.designpatterns.creational.abstractfactory.example2.side.Side;

public class Meal {

	private Drink drink;
	private MainCourse mainCourse;
	private Side side;
	
	public Drink getDrink() {
		return drink;
	}
	
	public void setDrink(Drink drink) {
		this.drink = drink;
	}
	
	public MainCourse getMainCourse() {
		return mainCourse;
	}
	
	public void setMainCourse(MainCourse mainCourse) {
		this.mainCourse = mainCourse;
	}
	
	public Side getSide() {
		return side;
	}
	
	public void setSide(Side side) {
		this.side = side;
	}
	
}