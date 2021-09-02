package com.clouddata.practise;

import java.util.Iterator;

public class StringCompression {

	public static void main(String[] args) {
		String s1="aaabbbbbbbccccdeef";
		char[] ch=s1.toCharArray();
		char prevProcessingChar=ch[0];
		int count=1;
		StringBuffer finalString=new StringBuffer();
		for (int i = 1; i < ch.length; i++) {
			char currentProcessingChar=ch[i];
			if(prevProcessingChar==currentProcessingChar) {
				count++;
			}
			else {
				finalString=finalString.append(prevProcessingChar).append(count);
				count=1;
				prevProcessingChar=currentProcessingChar;
			}
		}
		System.out.println(finalString.toString());
	}
}
