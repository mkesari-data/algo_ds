package com.linkedlist;

import java.util.HashMap;

public class SingleLinkedListUtil {

	private static Node header=null;
	private static Node tail=null;
	private static int SIZE=0;
	
	 void addHeaderToLinkedList(int headerValue) {
		System.out.println("Adding Header Value ->:"+headerValue);
		Node n=new Node(headerValue);
		if(header==null) {
			tail=n;
		}else {
			n.next=header;
		}
		header=n;
		SIZE+=1;
	}
	
	 void addTailToLinkedList(int tailValue) {
		System.out.println("Adding Tail Value ->:"+tailValue);
		Node n=new Node(tailValue);
		
		if(header==null) {
			header=n;
			tail=n;
		}else {
			tail.next=n;
			tail=n;
		}
		SIZE+=1;
	}
	
	 void addAt(int insertPosition,int nodeValue) throws InvalidPosition {
		System.out.println("Adding at "+insertPosition+" and Value is:->:"+nodeValue);
		
		if(insertPosition>SIZE)
			throw new InvalidPosition(insertPosition+":Is Invalid");
		else {
			
			if(insertPosition==1) {
				addHeaderToLinkedList(nodeValue);
			}
			else if(insertPosition==SIZE) {
				addTailToLinkedList(nodeValue);
			}
			else {
				Node n=new Node(nodeValue);
				Node pNode=header;
				int curPosition=1;
				while(curPosition<insertPosition) {
					pNode=pNode.next;
					curPosition+=1;
				}
				
				n.next=pNode.next;
				pNode.next=n;
				SIZE+=1;	
			}
			
		}
		
	}
	
	 void deleteHeader() {
		header=header.next;
		SIZE--;
		System.out.println("Header Deleted");
	}
	
	 void deleteTial() {
		if(header==tail) {
			header=tail=null;
		}
		else {
			Node prevNode=header;
			Node preseNode=prevNode.next;
			
			while(preseNode.next!=null) {
				preseNode=preseNode.next;
				prevNode=prevNode.next;
			}
			tail=prevNode;
			tail.next=null;
		}
		SIZE--;
		System.out.println("Tail Deleted");
	}
	

	void deleteNodeAt(int Position) {
		
	}

	void printLinkedList() {
		Node element=header;
		System.out.println("LinkedList Size is :"+SIZE);
		while(element!=null) {
			System.out.print(element.value +"-->");
			element=element.next;
		}
		System.out.println("\n");
	}
	
	void removeDuplicatesWithExtraSpace() {
		HashMap<Integer, Integer> hm=new HashMap<Integer,Integer>();
		Node prev=header;
		Node pres=header.next;
		hm.put(prev.value, new Integer(1));
		while(pres!=null) {
			if(!hm.containsKey(pres.value)) {
				hm.put(pres.value, new Integer(1));
				prev=prev.next;
				pres=pres.next;
			}
			else {
				prev.next=pres.next;
				pres=pres.next;
				SIZE--;
			}
		}
		
	}
	
	int returnKthLastElement(int kthPosition) throws InvalidPosition{
		if(header==null || kthPosition>SIZE)
			throw new InvalidPosition("Either Only one element or Invalid Kth Position");
		else {
			Node forwardNode=header;
			Node originalNode=header;
			int position=1;
			while(position++<=kthPosition) {
				forwardNode=forwardNode.next;
			}	
			while(forwardNode.next!=null) {
				forwardNode=forwardNode.next;
				originalNode=originalNode.next;
			}
			System.out.println(kthPosition+":Value From Last is:"+originalNode.value);
			return originalNode.value;
		}
	}
	

	void reverseSLL() {
		Node curr,next=null;
		Node prev=null;
		curr=header;
		tail=header;
		while(curr!=null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		header=prev;
	}
	
	/**
	 * Using Extra Datastructure(Set) I'm writing this. 
	 * This method yet to test. But similar method already written removeDuplicatesWithExtraSpace. 
	 * So neglecting this method. 
	 */
	void removeDuplicatesinUnsortedSLL_1() {
		Node prev=header;
		Node curr=header.next;
		java.util.Set<Integer> s=new java.util.HashSet<Integer>();
		while(curr!=null) {
		   if(s.contains(curr.value)) {
			   prev.next=curr.next;
		   }else {
			   s.add(curr.value);
			   prev.next=curr;
		   }	
		   prev=curr;
		   curr=curr.next;
		}
		tail=curr;
		
	}
	
	/**
	 *  If last node contains duplicates , this method is not handling. Correct it. 
	 * 
	 */
	void removeDuplicatesFromSortedSLL() {
		Node prev=header;
		int prevValue=header.value;
		Node current=header.next;
		while(current!=null) {
			if(prevValue==current.value) {
				current=current.next;
			}else {
				prevValue=current.value;
				prev.next=current;
				prev=current;
				current=current.next;
			}
		}
		tail=current;
	}
	
}
