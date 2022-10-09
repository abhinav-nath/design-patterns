package com.codecafe.designpatterns.structural.bridge;

public class Main {

  public static void main(String[] args) {
    MessageSender textMessageSender = new TextMessageSender();
    Message textMessage = new TextMessage(textMessageSender);
    textMessage.send("This is a test SMS");

    MessageSender emailMessageSender = new EmailMessageSender();
    Message emailMessage = new EmailMessage(emailMessageSender);
    emailMessage.send("This is a test mail");
  }

}