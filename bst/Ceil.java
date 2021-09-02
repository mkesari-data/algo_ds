package bst;

import java.util.Random;

public class Ceil {

	// TC:Theta(log n) SC:O(1)
	public static int ceil(BSTNode root, int x) {
		int res = Integer.MIN_VALUE;
		while (root != null) {
			if (x == root.data)
				return x;
			if (x < root.data) {
				res = root.data;
				root = root.left;
			} else
				root = root.right;
		}
		return res;
	}

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		BSTNode root = BSTUtils.buildRBST(n);
		BSTUtils.display(root);

		int x = new Random().nextInt(n) + 1;
		System.out.println(x);
		System.out.println(ceil(root, x));

	}

}
