package com.ds.stack;

import java.util.Stack;

public class InfixToPostFixConvertion {

	public static void main(String[] args) {
		System.out.println("Please Enter Infix Notation:");
		String infixExpression = new java.util.Scanner(System.in).next();
		String postFixExpression = convertInfixToPostFix(infixExpression);
		System.out.println(infixExpression + ":PostFix Notation is:" + postFixExpression);
	}

	static int operatorPrecedence(char operator) {
		int precedence;
		switch (operator) {
		case '+':
		case '-':
			precedence = 1;
			break;
		case '*':
		case '/':
			precedence = 2;
			break;
		case '^':
			precedence = 3;
			break;
		default:
			precedence = 0;
		}
		return precedence;
	}
	
	static String convertInfixToPostFix(String infixExpression) {
		
		char[] infixChars = infixExpression.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		StringBuffer output = new StringBuffer();
		for (int i = 0; i < infixChars.length; i++) {
			char c = infixChars[i];

			if (c == '(') {
				stack.push(c);
			
			} else if(c==')') {
			   /**
			    * Pop until we get (	
			    */
				
				while(!stack.isEmpty() && stack.peek()!='(') {
					output.append(stack.pop());
				}
			    if(!stack.isEmpty())
				stack.pop();
			}
			
			else if (Character.isAlphabetic(c)) {
				output.append(c);
			}
			else {
				/**
				 * 
				 */
				while(!stack.isEmpty() && (operatorPrecedence(stack.peek()))>=operatorPrecedence(c)) {
					output.append(stack.pop());
				}
				stack.push(c);
			}
		}
		while(!stack.isEmpty()) {
			output.append(stack.pop());
		}
		return output.toString();
	}

}
