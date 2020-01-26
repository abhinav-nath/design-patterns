package com.designpatterns.structural.bridge;

public class EmailMessage extends Message {
	
	public EmailMessage(MessageSender messageSender) {
		super(messageSender);
	}

	@Override
	public void send(String messageText) {
		messageSender.sendMessage(messageText);
	}

}