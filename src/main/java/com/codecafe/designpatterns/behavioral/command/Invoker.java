package com.codecafe.designpatterns.behavioral.command;

public class Invoker {

  private final Command command;

  public Invoker(Command command) {
    this.command = command;
  }

  public void execute() {
    this.command.execute();
  }

}