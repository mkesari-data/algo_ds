package com.queue;

public class QueueClient {

	public static void main(String[] args) {
		java.util.Scanner sc1 = new java.util.Scanner(System.in);
		
		
		CustomQ q=new CustomQ(5);
		do {
			System.out
					.println(" " +
			"1. Enqueu. \n" + 
			"2. Dequue \n "
			+"3. Get  "
			+"4. Quit ");

			int userOption = sc1.nextInt();
			switch (userOption) {
			case 1:
				System.out.println("Enter value to Insert");
				int qvalue = sc1.nextInt();
				q.enqueue(qvalue);
				break;
			case 2:
				int dequeValue=q.dequeue();
				System.out.println("Dequeue value:"+dequeValue);
				break;
			case 3:
				int topvalue=q.get();
				System.out.println("Top value in Queue:"+topvalue);
				break;
			case 4:
				System.exit(1);
			}
		} while (true);
	}
}
