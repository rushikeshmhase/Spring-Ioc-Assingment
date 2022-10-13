package com.yash.springioc.problem3;

public class ConstructorMessage {

	private String message;

	public ConstructorMessage(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void display() {
		System.out.println(message);
	}
	
	
	@Override
	public String toString() {
		return "ConstructorMessage [message=" + message + "]";
	}
	
	
	
}
