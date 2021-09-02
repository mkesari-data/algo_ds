package bst;

public class BSTNode {
	BSTNode left;
	BSTNode right;
	Integer data;
	int lst_size;
	
	public BSTNode(Integer data) {
		this.data = data;
	}
	
	public BSTNode(Integer data, int lst_size) {
		this.data = data;
		this.lst_size = lst_size;
	}

}
