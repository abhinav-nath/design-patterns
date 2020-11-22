package com.designpatterns.behavioral.command.example;

/* Concrete Command */
public class OnCommand implements Command {

    private Receiver receiver;

    public OnCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.switchOn();
    }

}