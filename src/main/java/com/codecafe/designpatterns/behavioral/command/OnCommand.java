package com.codecafe.designpatterns.behavioral.command;

/* Concrete Command */
public class OnCommand implements Command {

  private final Receiver receiver;

  public OnCommand(Receiver receiver) {
    this.receiver = receiver;
  }

  @Override
  public void execute() {
    receiver.switchOn();
  }

}