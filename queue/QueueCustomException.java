package com.queue;

public class QueueCustomException extends Exception{

	String msg;
	public QueueCustomException() {
		super();
	}
	public QueueCustomException(String msg) {
		super(msg);
		this.msg=msg;
	}
	
	public String toString() {
		return msg;
	}

}
