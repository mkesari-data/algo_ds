package com.arraypractise;

import java.util.Stack;

public class InfixToPostFixConversion {

	private static final String operators="+*-/";
	public static void main(String[] args) {
		String infix="(A+B*(C*D-E))";
		String postFixResult=convertToPostFix(infix);
		System.out.println("PostFix Result:"+postFixResult);
	}
	
	private static int precedence(char ch) {
		switch (ch) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;
		default:
			return 0;
		}
	}
	
	private static String convertToPostFix(String infix){
		char[] infixArray=infix.toCharArray();
		StringBuilder st=new StringBuilder();
		Stack<Character> s=new Stack<Character>();
		for (int i = 0; i < infixArray.length; i++) {
			char ch=infixArray[i];
			if(ch=='(') {
				s.push(ch);
			}else if(operators.indexOf(ch)!=-1) {
				/** 
				 * If this is operator
				 */
				while(!s.isEmpty()) {
					char c=s.peek();
					if((operators.indexOf(c)!=-1) && precedence(c)>=precedence(ch)) {
						st.append(s.pop());
					}
					else {
						s.push(ch);
						break;
					}
					
				}
				
			}
			else if(ch==')'){
				while(!s.isEmpty()) {
					char topValue=s.pop();
					if(topValue=='(')
						break;
					st.append(topValue);
					
				}
			}
			else {
				st.append(ch);
			}
		}
		return st.toString();
	}
}
