package com.codecafe.designpatterns.structural.bridge;

public class TextMessage extends Message {

  public TextMessage(MessageSender messageSender) {
    super(messageSender);
  }

  @Override
  public void send(String messageText) {
    messageSender.sendMessage(messageText);

  }

}