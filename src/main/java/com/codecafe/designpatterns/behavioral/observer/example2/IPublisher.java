package com.codecafe.designpatterns.behavioral.observer.example2;

public interface IPublisher {

  // attach and detach subscribers
  void attach(ISubscriber subscriber);

  void detach(ISubscriber subscriber);

  // notify all the subscribers
  void notifySubscribers();

  // get update from the publisher
  Object getUpdate();

}