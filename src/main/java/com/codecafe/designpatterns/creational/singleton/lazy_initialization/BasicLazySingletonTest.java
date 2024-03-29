package com.codecafe.designpatterns.creational.singleton.lazy_initialization;

public class BasicLazySingletonTest {

  public static void main(String[] args) {

    BasicLazySingleton basicSingleton1 = BasicLazySingleton.getInstance();

    System.out.println("basicSingleton1 : " + basicSingleton1.getValue());
    basicSingleton1.setValue(10);
    System.out.println("basicSingleton1 : " + basicSingleton1.getValue());

    BasicLazySingleton basicSingleton2 = BasicLazySingleton.getInstance();

    System.out.println("basicSingleton2 : " + basicSingleton2.getValue());

  }

}