package com.designpatterns.structural.bridge;

public abstract class Message {

    protected MessageSender messageSender;

    public Message(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    abstract public void send(String messageText);

}