package com.designpatterns.structural.bridge;

public class BridgeDemo {

	public static void main(String[] args) {

		MessageSender textMessageSender = new TextMessageSender();

		Message textMessage = new TextMessage(textMessageSender);

		textMessage.send("Hello! How are you?");

		MessageSender emailMessageSender = new EmailMessageSender();

		Message emailMessage = new EmailMessage(emailMessageSender);

		emailMessage.send("This is a test mail.");

	}

}