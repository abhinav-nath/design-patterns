package com.codecafe.designpatterns.behavioral.command.example;

public class TV implements Receiver {

  @Override
  public void switchOn() {
    System.out.println("TV switched on");
  }

  @Override
  public void switchOff() {
    System.out.println("TV switched off");
  }

}