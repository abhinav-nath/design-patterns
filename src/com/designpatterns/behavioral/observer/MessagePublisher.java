package com.designpatterns.behavioral.observer;

import java.util.Observable;

public class MessagePublisher extends Observable {

    private Message message;

    public void publishMessage(Message message) {
        this.message = message;
        setChanged();
        notifyObservers(message);
    }

    public Message getMessage() {
        return this.message;
    }

}