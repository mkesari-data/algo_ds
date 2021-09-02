package com.ds.trees;

public class BSTUtilClient {

	public static void main(String[] args) {
		BSTUtil bs = new BSTUtil();
		java.util.Scanner sc1 = new java.util.Scanner(System.in);
		do {
			System.out
					.println(" " + "1. Insert Node. \n" + "2. Search Node \n" + "3.Delete Node \n" + "4. Display BST  "
							+ "5.Traverse BST \n" + "6. Pretty Display \n" + " 7. Size of BST \n" + "9. Exit ");

			int userOption = sc1.nextInt();
			switch (userOption) {
			case 1:
				System.out.println("Enter How many Nodes you want to enter:");
				int numberofNodes = sc1.nextInt();
				bs.insert(numberofNodes);
				break;
			case 4:
				bs.displayBST();
				break;
			case 5:
				System.out.println("Selecting Traversing Techniqueue: 1. Inorder 2.PreOrder 3. PostOrder");
				int traverseOption = sc1.nextInt();
				bs.traverse(traverseOption);
				break;
			case 6:
				bs.pretydisplayBST();
				break;
			case 7:
				bs.sizeOfBST();
				break;
			case 9:
				System.exit(0);
			}
		} while (true);
		
	}
}
