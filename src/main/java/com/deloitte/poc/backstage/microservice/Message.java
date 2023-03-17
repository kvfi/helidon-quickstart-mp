package com.deloitte.poc.backstage.microservice;

public class Message {

	private String message;

	private String greeting;

	public Message() {
	}

	public Message(String message) {
		this.message = message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return this.message;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public String getGreeting() {
		return this.greeting;
	}
}
