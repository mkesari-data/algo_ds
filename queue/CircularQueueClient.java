package com.queue;

public class CircularQueueClient {

	public static void main(String[] args) {

		ArrayBasedCustomQueue q = new ArrayBasedCustomQueue(5);

		ArrayBasedCustomQueue q1 = new ArrayBasedCustomQueue(5);
		
		java.util.Scanner sc1 = new java.util.Scanner(System.in);
		do {
			System.out.println("\n " + 
		"1. Add element to Queue. \n" + 
		"2. Delete Element from Queue \n"
					+ "3. Display Queue \n" + "9. Exit \n");

			int userOption = sc1.nextInt();
			switch (userOption) {
			case 1:
				System.out.println("Enter value to Insert:");
				int value = sc1.nextInt();
				q.enqueue(value);
				break;
			case 2:
				int queValue=-9;
				try {
					queValue = q.dequeue();
				} catch (QueueCustomException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
				System.out.println("Deleted Value is:"+queValue);
				break;
			case 3:
				q.display();
				break;
			case 9:
				System.exit(0);
			}
		} while (true);

	}

}
