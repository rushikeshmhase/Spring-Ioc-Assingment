package com.yash.springioc.problem4;

public class SetterMessage {

	private String message;

//	public SetterMessage(String message) {
//		super();
//		this.message = message;
//	}
//
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
		return "SetterMessage [message=" + message + "]";
	}
	
	
}
