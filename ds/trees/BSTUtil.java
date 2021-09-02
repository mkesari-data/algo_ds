package com.ds.trees;

import java.util.Random;

public class BSTUtil {

	class Node {
		double value;
		Node left;
		Node right;

		Node(double value) {
			this.value = value;
			this.left = null;
			this.right = null;
		}
	}

	
	
	private Node root = null;

	/**
	 * findNode function. if value not Not Found : return null. & Update
	 * myParentNode reference. If value Found : return Node reference.
	 * 
	 * 
	 */
	Node parentNode = null;

	public Node findNode(double value) {
		Node current = root;
		Node previous = root;

		while (current != null) {
			if (current.value == value) {
				parentNode = previous;
				return current;
			} else if (value > current.value) {
				previous = current;
				current = current.right;
			} else {
				previous = current;
				current = current.left;
			}
		}
		parentNode = previous;
		return null;
	}

	/**
	 * insert Node function.
	 */

	public void insert(int no_of_nodes) {
		Random r=new Random();
		for(int i=0;i<no_of_nodes;i++) {
			
			double value=r.nextDouble()*10;	
			System.out.println(i+":th node inserting:,Node Value is:"+value);
			if (root == null) { 
				root = new Node(value);
			}
			Node findNode = findNode(value);
			if (findNode != null) {
				continue;
			} else if (value > parentNode.value) {
				parentNode.right = new Node(value);
			} else {
				parentNode.left = new Node(value);
			}
		}
		 
		
	}

	public void traverse(int traverseType) {
		String result="";
		switch (traverseType) {
		case 1: {
			inorderTravseral(root);
			break;
		}
		case 2: {
			preOrderTraversal(root);
			break;
		}
		case 3: {
			postOrderTraversal(root);
			break;
		}
		default:
			System.out.println("Invalid Traversing Option");
		}
		System.out.println("Traverse Result:"+result);
	}
	

	   public void printnode(Node x, int h)
	   {
	      for (int i = 0; i < h; i++)
	         System.out.print("        ");

	      System.out.println("[" + x.value + "]");
	   }

	   void displayBST()
	   {
	      showR( root, 0 );
	      System.out.println("================================");
	   }

	   public void showR(Node t, int h)
	   {
	      if (t == null)
	         return;

	      showR(t.right, h+1);
	      printnode(t, h);
	      showR(t.left, h+1);
	   }
	
		private void inorderTravseral(Node root) {
			Node temp = root;
			if (temp == null)
				return ;
			System.out.println(temp.value + "\t");
			inorderTravseral(temp.left);
			inorderTravseral(temp.right);
			
		}
	private void preOrderTraversal(Node root) {
		Node temp = root;
		if (temp == null)
			return ;
		inorderTravseral(temp.left);
		System.out.println(temp.value + "\t");
		inorderTravseral(temp.right);
	}

	private void postOrderTraversal(Node root) {
		Node temp = root;
		if (temp == null)
			return ;
		inorderTravseral(temp.left);
		inorderTravseral(temp.right);
		System.out.println(temp.value + "\t");
	}

	/**
	 * Pretty Display nothing but Windows Folder Structure format at left side. 
	 * 
	 * Ex : 
	 *    34 (root)
	 *             45(r) 
	 *                      48(r)
	 *                      38(l)
	 *             32(l)
	 *                      33(r)
	 *                      12(l)  
	 * 
	 */
	public void pretydisplayBST(){
		  displaywithSpaces(root,0,'r');
		
	}
	
	private void displaywithSpaces(Node root,int space,char label) {
		if(root==null)
			return;
		for (int i = 0; i < space; i++) {
			System.out.print(" ");
		}
		System.out.println("["+root.value+"]("+label+")");
		displaywithSpaces(root.left,space+4,'l');
		displaywithSpaces(root.right,space+4,'r');
	}
	
	/**
	 * One extra record coming , Need to Resolve. 
	 * @param root
	 * @return
	 */
	private int countNodes(Node root) {
		int noofNodes=0;
		if(root==null)
			return 1;
		int leftcount=noofNodes+countNodes(root.left);
		int rightcount=noofNodes+countNodes(root.right);
		return leftcount+rightcount;
	}
	public void sizeOfBST(){
		System.out.println("No of Nodes in Tree:=>"+countNodes(root));
		
	}
	
//
//	public void displayExactBST(){
//		  displayPreorderWithSpaces(root,0);
//	}
//	
//	private void displayPreorderWithSpaces(Node root, int spaces) {
//		if(root==null)
//			return;
//		displayPreorderWithSpaces(root.left, spaces + 4);
//		for (int i = 0; i < spaces; i++) {
//			System.out.print(" ");
//		}
//		System.out.println(root.value);
//		displayPreorderWithSpaces(root.right, spaces + 4);
//	}
	

	
}
