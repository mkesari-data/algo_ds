package com.linkedlist2;

public class SingleLinkedUtil implements SLLInterface {
	
	LLNode head;
	LLNode tail;
	int size;
	
	/**
	 * Add element. 
	 * 
	 * 1. head==null
	 *      Create Node and assing head=tail=node 
	 * 2. if head alrady exist. 
	 *     Create Node and tail.next=this node. 
	 *     tail=newnode. 
	 */
	
	public LLNode add(int element) {
		LLNode node=new LLNode(element);
		if(head==null) {
			head=node;
			tail=node;
		}else {
			tail.next=node;
			tail=node;
		}
		size++;
		return node;
	}
	
	
	
	public boolean delete(int element) {
	
		LLNode current=head;
		LLNode prev=head;
		
		while(current!=null) {
			
			if(current.value==element) {
				/**
				 *  1. Value matched and that is head element. 
				 *      1.1 -> head=head.next;
				 *  2. Value matched and that is tail element.
				 *      2.1 -> prev.next=null;
				 *      2.2 -> tail = previous 
				 *  3. value matched that is not tail and head
				 *      3.1 : prev.next = curr.next; 
				 */
				
				if(current==head) {
					 head=head.next;
				}else if(current==tail) {
					prev.next=null;
					tail=prev;
				}else {
					prev.next=current.next;
				}
				size--;
				
				if(size==0) {
					head=null;
					tail=null;
				}
				
				return true;
				
			}else {
				prev=current;
				current=current.next;
			}
			
		}
		
		return false;
		
	}
	
	public void reverseSLL() {
		LLNode prev=head;
		LLNode curr=head.next;
		LLNode next;
		
		while(curr.next!=null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		
	}
	
	
	public void rotateKnodes(int kthPosition) {
		LLNode backPointer=head;
		LLNode forwardPointer=head;
		int i=0;
		
		while(i<kthPosition) {
			forwardPointer=forwardPointer.next;
			i++;
		}
		
		while(forwardPointer.next!=null) {
			forwardPointer=forwardPointer.next;
			backPointer=backPointer.next;
		}
		
		forwardPointer.next=head;
		head=backPointer.next;
		backPointer.next=null;
		
	}
	
	/**
	 *   
	 * @param n : Last postition
	 * @return return last-nth node in SLL
	 */
	public LLNode returnNthNodeFromLast(int n) {
		
		 LLNode firstPointer=head;
		 LLNode secondPointer=head;

		 int i=0;
		 while(i<n) {
			 secondPointer=secondPointer.next;
			 i++;
		 }
		 
		 while(secondPointer!=null) {
			 firstPointer=firstPointer.next;
			 secondPointer=secondPointer.next;
		 }
		 
		 return firstPointer;
	}
	
	
	public void display() {
	
		LLNode curr=head;
		System.out.println();
		while(curr!=null) {
			System.out.print(curr.value+" | "+curr.next +"--------->");
			curr=curr.next;
		}
		System.out.println();
	
	}

}
