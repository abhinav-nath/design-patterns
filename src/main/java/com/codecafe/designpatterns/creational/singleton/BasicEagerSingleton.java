package com.codecafe.designpatterns.creational.singleton;

public class BasicEagerSingleton {

  private static final BasicEagerSingleton INSTANCE = new BasicEagerSingleton();

  int value = 0;

  private BasicEagerSingleton() {
  }

  public static BasicEagerSingleton getInstance() {
    return INSTANCE;
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }

}