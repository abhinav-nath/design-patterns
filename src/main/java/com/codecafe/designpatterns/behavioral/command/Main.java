package com.codecafe.designpatterns.behavioral.command;

public class Main {

  public static void main(String[] args) {
    Receiver tv = new TV();
    Command onCommand = new OnCommand(tv);
    Invoker invoker = new Invoker(onCommand);
    invoker.execute();

    Command offCommand = new OffCommand(tv);
    invoker = new Invoker(offCommand);
    invoker.execute();

    Receiver dvdPlayer = new DVDPlayer();
    onCommand = new OnCommand(dvdPlayer);
    invoker = new Invoker(onCommand);
    invoker.execute();

    offCommand = new OffCommand(dvdPlayer);
    invoker = new Invoker(offCommand);
    invoker.execute();
  }

}