package com.linkedlist;

public class InvalidPosition extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String str;
	
	InvalidPosition(String str){
		this.str=str;
	}
	
	public String toString() {
		return "Invalid Postion Entered :"+str;
	}
}
