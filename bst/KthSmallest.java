package bst;

import java.util.Random;

public class KthSmallest {

	// TC:Theta(n) SC:Theta(log n)
	public static int kthSmallest1(BSTNode root, int k) {
		MyInteger count = new MyInteger(0);
		BSTNode res = auxKthSmallest1(root, k, count);
		if (res == null)
			return Integer.MIN_VALUE;
		return res.data;
	}

	private static BSTNode auxKthSmallest1(BSTNode root, int k, MyInteger count) {
		if (root == null)
			return null;
		BSTNode res = auxKthSmallest1(root.left, k, count);
		if (res != null)
			return res;
		count.setValue(count.getValue() + 1);
		if (count.getValue() == k)
			return root;
		return auxKthSmallest1(root.right, k, count);
	}

	// TC:Theta(log n) SC:Theta(n)
	public static int kthSmallest2(BSTNode root, int k) {
		while (root != null) {
			if (k == root.lst_size + 1)
				return root.data;
			if (k < root.lst_size + 1)
				root = root.left;
			else {
				k = k - (root.lst_size + 1);
				root = root.right;
			}
		}
		return Integer.MIN_VALUE;
	}

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		BSTNode root = BSTUtils.buildRBST(n);
		BSTUtils.display(root);

		int k = new Random().nextInt(n) + 1;
		System.out.println(k);
		System.out.println(kthSmallest2(root, k));

	}

}
