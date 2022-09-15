package com.codecafe.designpatterns.behavioral.observer.example2;

public interface ISubscriber {

  // get subscriber name
  String getSubscriberName();

  // check if any message is published
  void update();

  // attach with the publisher
  void setPublisher(IPublisher publisher);

}