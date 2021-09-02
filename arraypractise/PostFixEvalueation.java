package com.arraypractise;

/**
 * Assumptions
 * 
 * 1. Receiving Valid PostFix Expression. 
 * 2. Performing with single digit postFix evaluation.   
 * @return
 */
public class PostFixEvalueation {

	public static void main(String[] args) {
		
		System.out.println("Enter PostFix Expression");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String postFixExp = sc.next();
		int finalResult = evalueatePostFixExp(postFixExp);
		System.out.println("Final Result is:" + finalResult);
		sc.close();
	}
	
	static int evalueatePostFixExp(String postFixExp) {
		char[] ch=postFixExp.toCharArray();
		java.util.Stack<Integer> opStack=new java.util.Stack<Integer>();
		for (int i = 0; i < ch.length; i++) {
			char c=ch[i];
			
			if(Character.isDigit(c)) {				
				opStack.push(Character.getNumericValue(c));
			}
			else {
			   	int secondOperand=opStack.pop();
			   	int firstOperand=opStack.pop();
			   	int result=0;
			   	result = postFixCalc(c, secondOperand, firstOperand, result);
			   	opStack.push(result);
			}
		}
		return opStack.pop();
	}

	private static int postFixCalc(char c, int secondOperand, int firstOperand, int result) {
		switch (c) {
		case '+':
			result = firstOperand + secondOperand;
			break;
		case '-':
			result = firstOperand - secondOperand;
			break;
		case '*':
			result = firstOperand * secondOperand;
			break;
		case '/':
			result = firstOperand / secondOperand;
			break;
		}
		return result;
	}
}
