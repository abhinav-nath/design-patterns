package com.designpatterns.behavioral.observer;

public class Main {

    public static void main(String[] args) {

        MessagePublisher messagePublisher = new MessagePublisher();

        MessageSubscriber subscriber1 = new MessageSubscriber("Subscriber1");
        MessageSubscriber subscriber2 = new MessageSubscriber("Subscriber2");
        MessageSubscriber subscriber3 = new MessageSubscriber("Subscriber3");

        messagePublisher.addObserver(subscriber1);
        messagePublisher.addObserver(subscriber2);
        messagePublisher.addObserver(subscriber3);

        Message message = new Message("Hello");
        messagePublisher.publishMessage(message);

        System.out.println();

        message = new Message("Hello World!");
        messagePublisher.publishMessage(message);

    }

}