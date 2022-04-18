package com.codecafe.designpatterns.creational.prototype;

public class CloneFactory {

  public Animal getClone(Animal animalSample) {
    return animalSample.makeCopy();
  }

}