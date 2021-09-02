package com.linkedlist;
import java.util.Scanner;


public class SingleLinkedListDemo {

	public static void main(String[] args) {
		
		do {
			System.out.println("Enter Your Input  \n"
					
				+ " 1. Insert At Start  \n"
				+ " 2. Insert at End  \n"
				+ " 3. Insert at Position  \n"
				+ " 4. Delete Header  \n"
				+ " 5. Delete Tail  \n"
				+ " 6. Delete At  \n"
				+ " 7. Print LinkedList \n"
				+ " 8. Remove Duplicates \n"
				+ " 9. Return Kth Element from Last\n"
				+ " 10. Reverse SLL\n"
				+ " 12. Remove Duplicates from Sorted SLL\n"
				+ " 99. Exit \n"
				
				);
		System.out.println("Enter Your Input Now:->");
		Scanner sc=new Scanner(System.in);
		int userInput=sc.nextInt();
		SingleLinkedListUtil sl=new SingleLinkedListUtil();
		switch (userInput) {
		case 1:
				System.out.println("Insert Header Value:=>");
				int headerValue=sc.nextInt();
				sl.addHeaderToLinkedList(headerValue);
				sl.printLinkedList();
				break;
		case 2:
				System.out.println("Insert Tail Value:=>");
				int tailValue=sc.nextInt();
				sl.addTailToLinkedList(tailValue);
				sl.printLinkedList();
				break;
		case 3:
				System.out.println("Insert Postion :=>");
				int position=sc.nextInt();
				System.out.println("Insert Node VALUE:=>");
				int nodeValue=sc.nextInt();
				try {
					sl.addAt(position, nodeValue);
				} catch (InvalidPosition e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				sl.printLinkedList();
				break;
		case 4:
				System.out.println("Delete Header:=>");
				sl.deleteHeader();
				sl.printLinkedList();
				break;
		case 5:
				System.out.println("Delete Tail:=>");
				sl.deleteTial();
				sl.printLinkedList();
				break;

		case 6:
				System.out.println("Enter Position to Delete:=>");
				int delPosition=sc.nextInt();
				sl.deleteNodeAt(delPosition);
				sl.printLinkedList();
				break;
		case 7:
				System.out.println(" Printing LinkedList");
				sl.printLinkedList();
				break;
		case 8:
				System.out.println(" Remove Duplicates");
				sl.removeDuplicatesWithExtraSpace();
				sl.printLinkedList();
				break;
		case 9:
				System.out.println(" Enter Kth Position:->");
				int kposition=sc.nextInt();
				try {
					sl.returnKthLastElement(kposition);
				} catch (InvalidPosition e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
		case 10:
				System.out.println(" Rervse Linked List:->");
				sl.reverseSLL();
				sl.printLinkedList();
				break;
		case 11:
				System.out.println(" Remove Duplicates in Unsorted SLL  Using Extra Space:->");
				sl.removeDuplicatesinUnsortedSLL_1();
				sl.printLinkedList();
				break;
		case 12:
				System.out.println(" Remove Duplicates in Sorted SLL  :->");
				sl.removeDuplicatesFromSortedSLL();
				sl.printLinkedList();
				break;
		case 99:
				System.out.println("**** Exit ****");
				System.exit(0);
				break;
		}
			
		}while(true);
	}
	
	
	
}
