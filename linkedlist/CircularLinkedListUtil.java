package com.linkedlist;

public class CircularLinkedListUtil {

	private static Node header=null;
	private static Node tail=null;
	private static int SIZE=0;
	
	 void addHeaderToLinkedList(int headerValue) {
		System.out.println("Adding Header Value ->:"+headerValue);
		Node n=new Node(headerValue);
		if(header==null) {
			tail=n;
			tail.next=n;
		}else {
			n.next=header;
		}
		header=n;
		SIZE+=1;
	}
	
}
