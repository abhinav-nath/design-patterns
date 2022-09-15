package com.codecafe.designpatterns.behavioral.command;

/* Concrete Command */
public class OffCommand implements Command {

  private final Receiver receiver;

  public OffCommand(Receiver receiver) {
    this.receiver = receiver;
  }

  @Override
  public void execute() {
    receiver.switchOff();
  }

}