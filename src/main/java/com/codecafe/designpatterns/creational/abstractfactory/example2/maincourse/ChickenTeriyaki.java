package com.codecafe.designpatterns.creational.abstractfactory.example2.maincourse;

public class ChickenTeriyaki implements MainCourse {

  private String mainCourseName = null;

  @Override
  public void setMainCourseName() {
    mainCourseName = "Chicken Teriyaki";
  }

  @Override
  public String getMainCourseName() {
    return mainCourseName;
  }

}