package com.codecafe.designpatterns.behavioral.command.example;

/* Concrete Command */
public class OffCommand implements Command {

    private Receiver receiver;

    public OffCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.switchOff();
    }

}