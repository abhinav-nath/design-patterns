package com.codecafe.designpatterns.behavioral.observer.example2;

public class MessageSubscriber implements ISubscriber {

    private String subscriberName;
    private IPublisher publisher;

    public MessageSubscriber(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    @Override
    public String getSubscriberName() {
        return this.subscriberName;
    }

    @Override
    public void update() {
        String message = (String) publisher.getUpdate();
        if (message == null)
            System.out.println(subscriberName + " : No new message");
        else
            System.out.println(subscriberName + " : Received message : " + message);
    }

    @Override
    public void setPublisher(IPublisher publisher) {
        this.publisher = publisher;
    }

}