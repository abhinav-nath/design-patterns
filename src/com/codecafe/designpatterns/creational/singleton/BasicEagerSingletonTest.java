package com.codecafe.designpatterns.creational.singleton;

public class BasicEagerSingletonTest {

    public static void main(String[] args) {

        BasicEagerSingleton basicSingleton1 = BasicEagerSingleton.getInstance();

        System.out.println("basicSingleton1 : " + basicSingleton1.getValue());
        basicSingleton1.setValue(10);
        System.out.println("basicSingleton1 : " + basicSingleton1.getValue());

        BasicEagerSingleton basicSingleton2 = BasicEagerSingleton.getInstance();

        System.out.println("basicSingleton2 : " + basicSingleton2.getValue());

    }

}