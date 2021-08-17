package com.codecafe.designpatterns.behavioral.command.example;

public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void execute() {
        this.command.execute();
    }

}