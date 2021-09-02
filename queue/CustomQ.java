package com.queue;

/**
 * This handles only Int type values. 
 * @author Mohan and Team
 *
 */
public class CustomQ {

	int[] q;
	
	int defaultSize=10;
	
	CustomQ(int size){
		defaultSize=size;
		q=new int[defaultSize];
	}
	
	CustomQ(){
		q=new int[defaultSize];
	}
	
	int front=-1;
	int rear=-1;
	int size=0;
	
	
	public void enqueue(int element) {
		
		if(rear<defaultSize-1) {
			q[++rear]=element;	
		}else {
			System.out.println("Your Queue is full");
		}
		
	}
	
	public int dequeue() {
		if(front<rear && rear!=-1) {
			return q[++front];
		}else {
			System.out.println("Q is Empty");
			return -9;
		}
	}
	
	public boolean isFull() {
		return (defaultSize)==(rear+1);
	}
	
	public boolean isEmpty() {
		return (rear==-1) || (front==rear);
	}
	
	public int get() {
		if (! isEmpty())
			return q[front + 1];
		else
			return -9;
	}
	
}
