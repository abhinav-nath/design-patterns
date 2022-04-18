package com.codecafe.designpatterns.behavioral.observer.example2;

public interface ISubscriber {

  // get subscriber name
  public String getSubscriberName();

  // check if any message is published
  public void update();

  // attach with the publisher
  public void setPublisher(IPublisher publisher);

}