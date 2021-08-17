package com.codecafe.designpatterns.creational.abstractfactory.example2.maincourse;

public class Pizza implements MainCourse {

    private String mainCourseName = null;

    @Override
    public void setMainCourseName() {
        mainCourseName = "Pizza";
    }

    @Override
    public String getMainCourseName() {
        return mainCourseName;
    }

}