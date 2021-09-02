package bst;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class BSTUtils {

	// TC:Theta(n) SC:O(log n)
	public static BSTNode buildBST(int n) {
		return auxBuildBST(1, n);
	}

	private static BSTNode auxBuildBST(int l, int r) {
		if (l > r)
			return null;
		if (l == r)
			return new BSTNode(l, 0);
		int m = (l + r) / 2;
		BSTNode root = new BSTNode(m, m-l);
		root.left = auxBuildBST(l, m - 1);
		root.right = auxBuildBST(m + 1, r);
		return root;
	}

	
	public static BSTNode buildRBST(int n) {
		int[] in = new int[n];
		Random r = new Random();
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < n;) {
			int tmp = r.nextInt(2 * n) + 1;
			if (!set.contains(tmp)) {
				in[i++] = tmp;
				set.add(tmp);
			}
		}
		Arrays.sort(in);
		return auxBuildRBST(in, 0, n - 1);
	}

	// TC:Theta(n) SC:O(log n)
	private static BSTNode auxBuildRBST(int[] in, int l, int r) {
		if (l > r)
			return null;
		if (l == r)
			return new BSTNode(in[l], 0);
		int m = (l + r) / 2;
		BSTNode root = new BSTNode(in[m], m-l);
		root.left = auxBuildRBST(in, l, m - 1);
		root.right = auxBuildRBST(in, m + 1, r);
		return root;
	}

	private static void auxDisplay(BSTNode root, int nspaces, String annotation) {
		if (root == null)
			return;
		for (int i = 0; i < nspaces; ++i)
			System.out.print(" ");
		System.out.println(root.data + "(" + annotation + "," + root.lst_size + ")");
		auxDisplay(root.left, nspaces + 4, "L");
		auxDisplay(root.right, nspaces + 4, "R");
	}

	public static void display(BSTNode root) {
		auxDisplay(root, 0, "root");
	}

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		
//		BSTNode root = buildBST(n);
//		display(root);
		
		BSTNode root = buildRBST(n);
		display(root);
	}

}
