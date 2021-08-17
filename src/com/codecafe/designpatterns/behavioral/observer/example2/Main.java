package com.codecafe.designpatterns.behavioral.observer.example2;

public class Main {

    public static void main(String[] args) {

        // create a message publisher
        MessagePublisher messagePublisher = new MessagePublisher();

        // create subscribers
        ISubscriber subscriber1 = new MessageSubscriber("Subscriber1");
        ISubscriber subscriber2 = new MessageSubscriber("Subscriber2");
        ISubscriber subscriber3 = new MessageSubscriber("Subscriber3");

        // attach subscribers to the publisher
        messagePublisher.attach(subscriber1);
        messagePublisher.attach(subscriber2);
        messagePublisher.attach(subscriber3);

        // attach publisher to the subscribers
        subscriber1.setPublisher(messagePublisher);
        subscriber2.setPublisher(messagePublisher);
        subscriber3.setPublisher(messagePublisher);

        System.out.println();

        // check if any update is available
        subscriber1.update();

        // now publish a new message
        messagePublisher.postMessage("Hello World!");

        System.out.println();

        // detach subscriber2 from publisher
        messagePublisher.detach(subscriber2);

        // send another message
        messagePublisher.postMessage("Hakuna Matata!");

    }

}