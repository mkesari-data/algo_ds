package com.avl2;

public class BBSTNode {

	BBSTNode parent;
	BBSTNode left;
	BBSTNode right;
	int height;
	double value;
	
	public BBSTNode(double value) {
		super();
		this.value = value;
	    this.height=1;
	}
	
}
