package com.arraypractise;

import java.util.Stack;

/**
 * Assumptions : 1. We are handling only + , * , - , / ^ , ( ) 2. Single digit
 * operation only. 3. Make sure input is valid expression.
 * 
 * @author User
 *
 */
public class InfixEvalueation {

	public static void main(String[] args) {

		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.println("Please provide valid Infix Expression:");
		String infixExp = sc.next();

		int result=evalueateInfixExp(infixExp);
		System.out.println("Final Result:"+result);

		sc.close();

	}

	private static int evalueateInfixExp(String infixExp) {
		char[] ch = infixExp.toCharArray();
		Stack<Character> operatorStack = new Stack<Character>();
		Stack<Integer> operandStack = new Stack<Integer>();
		for (int i = 0; i < ch.length; i++) {
			char c = ch[i];
			/**
			 * 1. If operand , Just push to Operanad stack.
			 */
			if (Character.isDigit(c)) {
				operandStack.push(Character.getNumericValue(c));
			} else {
				switch (c) {
				case '(':
					operatorStack.push('(');
					break;
				case ')':

					/**
					 * 
					 * while(opeandstack ! empty && operatrosstack !empty &&
					 * operatorstack.peek()!='(') Pop top element from operators stack. Pop top 2
					 * elements from Operand stack. Perform operation and push to operand stack.
					 * 
					 */

					while (!operandStack.isEmpty() && !operatorStack.isEmpty() && operatorStack.peek() != '(') {
						char operator = operatorStack.pop();
						int secondOperand = operandStack.pop();
						int firstOperand = operandStack.pop();
						int result = calc(operator, secondOperand, firstOperand);
						operandStack.push(result);
					} // while

					if (!operatorStack.isEmpty()) {
						operandStack.pop();
					}

					break;
				default:
					/**
					 * Operator precedence.
					 * 
					 * 1. If current operator precedence is >= then just simply push to Operator
					 * stack.
					 * 
					 * while(precedence(current_operator) < precedence(ops_stack.peek() && opsstack
					 * and operatorstack should not be empty) 2. if current operator precedence <
					 * operator stack top operator precedence. 1. Then pop the top element from the
					 * operator stack. 2. Pop 2 elements from opernd stack 3. Perform operation and
					 * push back result to operand stack.
					 * 
					 */

					if (operatorStack.isEmpty() || ( precedence(c) >= precedence(operatorStack.peek()) )) {
						operatorStack.push(c);
					} else {
						while (!operandStack.isEmpty() && !operatorStack.isEmpty()
								&& precedence(c) < precedence(operatorStack.peek())) {
							char operator = operatorStack.pop();
							int secondOperand = operandStack.pop();
							int firstOperand = operandStack.pop();
							int result = calc(operator, secondOperand, firstOperand);
							operandStack.push(result);
						} // while
					}

				} // switch

			} // else
			
		} // for Loop
		
		while(!operatorStack.isEmpty()) {
			char operator = operatorStack.pop();
			int secondOperand = operandStack.pop();
			int firstOperand = operandStack.pop();
			int result = calc(operator, secondOperand, firstOperand);
			operandStack.push(result);
		}
		return operandStack.pop();
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

	private static int calc(char operator, int secondOperand, int firstOperand) {
		int result = 0;
		switch (operator) {
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
