package com.codecafe.designpatterns.behavioral.observer.example2;

public interface IPublisher {

  // attach and detach subscribers
  public void attach(ISubscriber subscriber);

  public void detach(ISubscriber subscriber);

  // notify all the subscribers
  public void notifySubscribers();

  // get update from the publisher
  public Object getUpdate();

}