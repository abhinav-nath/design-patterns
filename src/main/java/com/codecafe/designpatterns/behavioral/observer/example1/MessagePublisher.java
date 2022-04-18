package com.codecafe.designpatterns.behavioral.observer.example1;

import java.util.Observable;

public class MessagePublisher extends Observable {

  private String message;

  public void publishMessage(String message) {
    this.message = message;
    setChanged();
    notifyObservers(message);
  }

  public String getMessage() {
    return this.message;
  }

}