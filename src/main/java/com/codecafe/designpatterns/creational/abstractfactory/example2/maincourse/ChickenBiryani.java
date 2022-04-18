package com.codecafe.designpatterns.creational.abstractfactory.example2.maincourse;

public class ChickenBiryani implements MainCourse {

  private String mainCourseName = null;

  @Override
  public void setMainCourseName() {
    mainCourseName = "Chicken Biryani";
  }

  @Override
  public String getMainCourseName() {
    return mainCourseName;
  }

}