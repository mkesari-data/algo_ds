package com.ds.stack;

import java.util.Iterator;

public class InfixToPrefixConvertion {

	public static void main(String[] args) {
		System.out.println("Please Enter Infix Notation:");
		String infixExpression = new java.util.Scanner(System.in).next();
		String postFixExpression = convertInfixToPreFix(infixExpression);
		System.out.println(infixExpression + ":PrefFix Notation is:" + postFixExpression);
	}
	
	static String convertInfixToPreFix(String infixExp) {
		/**
		 * 1. Reverse & replace ( )  the infixExpr
		 * 2. Infix to PostFix. 
		 * 3.  Reverse the output
		 */
		String reverseInfix=reverseAndReplaceInputExpresssion(infixExp);
		char[] infixPostFixExp= InfixToPostFixConvertion.convertInfixToPostFix(reverseInfix).toCharArray();
		StringBuffer finalResult=new StringBuffer();
		for (int i = infixPostFixExp.length-1; i >=0 ; i--) {
			finalResult.append(infixPostFixExp[i]);
		}
		return finalResult.toString();
	}
	
	static String reverseAndReplaceInputExpresssion(String infixExp) {
		char[] ch=infixExp.toCharArray();
		StringBuffer sb=new StringBuffer();
		for (int i = ch.length-1; i >=0 ; i--) {
			if(ch[i]=='(') {
				sb.append(')');
			}else if(ch[i]=='(') {
				sb.append('(');
			}else {
				sb.append(ch[i]);
			}
		}
		return sb.toString();
	}
}
