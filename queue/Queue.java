package com.queue;

public interface Queue {

	void enqueue(int element);
	int dequeue() throws QueueCustomException;
	
	boolean isEmpty();
	boolean isFull();
	
	default void display() {
	  	System.out.println("Default Display");
	}
	
}
