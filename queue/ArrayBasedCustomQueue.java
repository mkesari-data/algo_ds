package com.queue;

public class ArrayBasedCustomQueue implements Queue {

	int front = 0;
	int rear = 0;
	int[] q;
	int CAPACITY = 10;
	int size = 0;

	ArrayBasedCustomQueue(int size) {
		CAPACITY = size;
		q = new int[CAPACITY];
	}

	ArrayBasedCustomQueue() {
		q = new int[CAPACITY];
	}

	public boolean isEmpty() {
		return (size == 0) ? true : false;
	}

	public boolean isFull() {
		return (size == CAPACITY) ? true : false;
	}
	

	public void enqueue(int element) {
		// whenever add element increase size variable.
		// size always should tell the number of elements in my array.
		// size should be less than or equal to my array size.

		if (!isFull()) {

			q[rear] = element;
			size++;
			rear = (rear + 1) % CAPACITY;
		} else {
			
			System.out.println("Your queue is Full");
		}
	}

	public int dequeue() throws QueueCustomException {
		if (isEmpty()) {
			throw new QueueCustomException("Your Queue is Empty");
		}

		int queuevalue = q[front];
		front = (front + 1) % CAPACITY;
		size--;
		return queuevalue;
	}

	public void display() {
		int j = front;
		for (int i = 0; i < size; i++) {
			System.out.print(q[j] + " , ");
			j = (j + 1) % CAPACITY;
		}
	}

}
