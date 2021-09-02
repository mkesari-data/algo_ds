package com.ds.trees;


public class BinarySearchTree_Custom {

	
	/**
	 * Define TreeNode Class
	 */

	static class TNode{
		double value;
		TNode left,right;
		
		public TNode(double value){
			this.value=value;
			this.left=null;
			this.right=null;
		}
	}
	
	private static TNode root=null;
	
	public static void main(String[] args) {
		
		do {
			System.out.println(" 1. Insert Node. \n 2. Search Node \n 3.Delete Node 4.Display Tree 9. Exit");
			java.util.Scanner sc=new java.util.Scanner(System.in);
			int userOption=sc.nextInt();
			switch(userOption) {
			case 1: 
				System.out.println("Enter Node value to Insert:");
				double nodeValue=sc.nextDouble();
				insertNode(nodeValue);
				break;
				
			case 4:
				displayBST();
				break;
			case 9: System.exit(0);
			}
		}while(true);
		
	}
	
	 static void insertNode(double nodeValue) {
		 TNode newNode=new TNode(nodeValue);
		 /**
		  * If Tree is Empty
		  */
		if(root==null) {
			root=newNode;
		}
		/**
		 * If tree is already formed. Find the correct position to insert the node. 
		 */
		else {
			
			TNode currNode=root;
			TNode prevNode=root;
			
			while(true) {
				if(nodeValue>currNode.value) {
					if(currNode.right!=null) {
						currNode=currNode.right;
					}else {
					    currNode.right=newNode;	
					}
					
				}
				else if(nodeValue<currNode.value) {
					if(currNode.left!=null) {
						currNode=currNode.left;
					}else {
					    currNode.left=newNode;	
					}
				}
				else {
					System.out.println("Duplicate Valute trying to Insert");
					break;
				}
			
			}
			
		}
	}
	 
	 /* =======================================================
     Show what the BST look like....
     ======================================================= */

  public static void printnode(TNode x, int h)
  {
     for (int i = 0; i < h; i++)
        System.out.print("        ");

     System.out.println("[" + x.value + "]");
  }

  static void displayBST()
  {
     showR( root, 0 );
     System.out.println("================================");
  }

  public static void showR(TNode t, int h)
  {
     if (t == null)
        return;

     showR(t.right, h+1);
     printnode(t, h);
     showR(t.left, h+1);
  }
  
//  
//	 static void display(TNode t,int height){
//		 for (int i = 0; i < height; i++) {
//			System.out.print("        ");
//		}
//		 System.out.println(t.value);
//	 }
//	 
//	 static void print(TNode t,int h){
//		 if(t==null)
//			 return;
//		print(t.right,h+1);	 
//		display(t,h);
//		 print(t.left,h++);
//	 }
//	 
//	 public static void displayBST() {
//		 print(root,0);
//		 
//	 }
//	 
//	 
	 
	 /**
	  * In- Progress. 
	  * @param value
	  */
	public static void deleteNode(double value) {
		if (value == root.value) {
			root = null;
		} else {
			TNode nextNode ;
			TNode presentNode = root;
			if (value > presentNode.value) {
				nextNode = presentNode.right;
				
			} else {
				nextNode = presentNode.left;
			}
		}

	}
	 
	 
	
}
