package com.codecafe.designpatterns.structural.bridge;

public abstract class Message {

    protected MessageSender messageSender;

    protected Message(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    protected abstract void send(String messageText);

}