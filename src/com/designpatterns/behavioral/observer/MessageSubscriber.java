package com.designpatterns.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

public class MessageSubscriber implements Observer {

    private final String subscriberName;

    public MessageSubscriber(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    @Override
    public void update(Observable observable, Object obj) {

        if (obj instanceof Message) {
            System.out.println(subscriberName + " received message : " + ((Message) obj).getContent());
        }

    }

}