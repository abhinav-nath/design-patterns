package com.codecafe.designpatterns.behavioral.observer.example2;

import java.util.ArrayList;
import java.util.List;

public class MessagePublisher implements IPublisher {

    private List<ISubscriber> subscribers;
    private String message;
    private boolean changed;
    private final Object MONITOR = new Object();

    public MessagePublisher() {
        this.subscribers = new ArrayList<>();
    }

    @Override
    public void attach(ISubscriber subscriber) {

        if (subscriber == null)
            throw new NullPointerException("Null Observer");

        synchronized (MONITOR) {
            if (!subscribers.contains(subscriber)) {
                subscribers.add(subscriber);
                System.out.println(subscriber.getSubscriberName() + " attached");
            }
        }
    }

    @Override
    public void detach(ISubscriber subscriber) {
        synchronized (MONITOR) {
            subscribers.remove(subscriber);
            System.out.println(subscriber.getSubscriberName() + " detached");
        }
    }

    @Override
    public void notifySubscribers() {

        List<ISubscriber> subscribersLocal = null;
        // synchronization is used to make sure any observer registered
        // after message is received is not notified

        synchronized (MONITOR) {
            if (!changed)
                return;
            subscribersLocal = new ArrayList<>(this.subscribers);
            this.changed = false;
        }

        for (ISubscriber sub : subscribersLocal)
            sub.update();

    }

    @Override
    public Object getUpdate() {
        return this.message;
    }

    // method to post message to the topic
    public void postMessage(String msg) {
        System.out.println("\nNew message posted : " + msg + "\n");
        this.message = msg;
        this.changed = true;
        notifySubscribers();
    }

}