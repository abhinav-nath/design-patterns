package com.codecafe.designpatterns.creational.singleton;

import java.io.Serializable;

public class Singleton implements Serializable {

  private static final long serialVersionUID = 1L;

  private static final Singleton soleInstance = new Singleton();

  private Singleton() {
    System.out.println("Creating...");
  }

  public static Singleton getInstance() {
    return soleInstance;
  }

  // Implementing readResolve method prevents Singleton from breaking when
  // serializing and deserializing
  protected Object readResolve() {
    return soleInstance;
  }

}