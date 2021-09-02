package bst;

import java.util.Random;

public class BSTSearch {

	// TC:Theta(log n) SC:O(1)
	public static boolean search(BSTNode root, int x) {
		while (root != null) {
			if (x == root.data)
				return true;
			if (x < root.data)
				root = root.left;
			else
				root = root.right;
		}
		return false;
	}

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		BSTNode root = BSTUtils.buildBST(n);
//		BSTUtils.display(root);

		int x = new Random().nextInt(n) + 1;
		System.out.println(x);
		System.out.println(search(root, x));

		x = 0;
		System.out.println(x);
		System.out.println(search(root, x));

	}

}
