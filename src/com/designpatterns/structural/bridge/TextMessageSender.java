package com.designpatterns.structural.bridge;

public class TextMessageSender implements MessageSender {

    @Override
    public void sendMessage(String messageText) {
        System.out.println("TextMessageSender : Sending text message - "+messageText);

    }

}