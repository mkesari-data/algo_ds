package com.linkedlist2;

public class SLLClient {

	public static void main(String[] args) {
		SingleLinkedUtil sl=new SingleLinkedUtil();
		java.util.Scanner sc1 = new java.util.Scanner(System.in);
		do {
			System.out.println(" " + "1. Insert Node. \n" + "2. Delte Node \n " + "3. Display LL \n 4. Riverse SLL\\n "
					+ "6.Kth position to swap 5.Return nth Last element " + "9. Exit \n");

			int userOption = sc1.nextInt();
			switch (userOption) {
			case 1:
				System.out.println("Enter Valuter to insert:");
				int nodeValue = sc1.nextInt();
				sl.add(nodeValue);
				break;
			case 2:
				System.out.println("Enter Valuter to Delete:");
				int deleteValue = sc1.nextInt();
				System.out.println(sl.delete(deleteValue));
				break;
			case 3:
				sl.display();
				break;
//			case 4:
//				sl.riverseSLL();
//				sl.display();
//				break;
				
			case 5: 
				System.out.println("Enter Nth Position to retrun from Last:");
				int nthPosition = sc1.nextInt();
				System.out.println(sl.returnNthNodeFromLast(nthPosition).value);
				break;
			case 6: 
				System.out.println("Enter Kth Position to Rotate:");
				int kthPosition = sc1.nextInt();
				sl.rotateKnodes(kthPosition);
				break;
			
			case 9:
				System.exit(0);
			}
		} while (true);
	}
}
