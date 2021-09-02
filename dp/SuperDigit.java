package com.dp;

import java.util.Iterator;

public class SuperDigit {

	public static void main(String[] args) {
		
		String number = "148148148";
		number=number.repeat(3);
		System.out.println(number);
		System.out.println(convertToSuperDigit(number));
	}
	
	private static int convertToSuperDigit(String number) {
		
		if(number.length()<=1) {
			return Integer.parseInt(number);
		}
		char[] digits=number.toCharArray();
		int sum=0;
		for (int i = 0; i < digits.length; i++) {
			sum=sum+((int)digits[i]-48);
		}
			return convertToSuperDigit(String.valueOf(sum));
	}
}
