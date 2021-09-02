package com.arraypractise;

public class StackUnderFlowException extends Exception{

	private static final long serialVersionUID = 1L;
	
	String msg;
	StackUnderFlowException(String str){
		super(str);
	}
//	
//	public String toString() {
//		return msg;
//	}
}
