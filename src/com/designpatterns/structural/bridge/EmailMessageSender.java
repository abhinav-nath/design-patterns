package com.designpatterns.structural.bridge;

public class EmailMessageSender implements MessageSender {

	@Override
	public void sendMessage(String messageText) {
		System.out.println("EmailMessageSender : Sending email message - "+messageText);
	}

}