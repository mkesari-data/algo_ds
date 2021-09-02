package com.avltree;

public class BSTEntry {
	
	public String key;
	public String value;
	
	public int height;
	
	public BSTEntry parent;
	public BSTEntry left;
	public BSTEntry right;

	
	public BSTEntry(String k,String v) {
		this.key=k;
		this.value=v;
		this.height=1;
	}
}
