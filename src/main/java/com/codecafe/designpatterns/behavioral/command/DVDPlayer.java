package com.codecafe.designpatterns.behavioral.command;

public class DVDPlayer implements Receiver {

  @Override
  public void switchOn() {
    System.out.println("DVD player switched on");
  }

  @Override
  public void switchOff() {
    System.out.println("DVD player switched off");
  }
}