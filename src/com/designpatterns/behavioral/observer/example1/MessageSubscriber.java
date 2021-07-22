package com.designpatterns.behavioral.observer.example1;

import java.util.Observable;
import java.util.Observer;

public class MessageSubscriber implements Observer {

    private final String subscriberName;

    public MessageSubscriber(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    @Override
    public void update(Observable observable, Object obj) {
        System.out.println(subscriberName + " received message : " + obj);
    }

}