package com.java8;
import java.util.*;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		int[] a= {0};
		StringBuffer sb= new StringBuffer();
		Arrays.stream(a).forEach(ele -> sb.append(ele));
		System.out.println(sb);
		Long l= Long.parseLong(sb.toString());
		l=l+1;
		String s= String.valueOf(l);
		int numberOfDigits=s.length();
		int[] newArray=new int[numberOfDigits];
		
		for(long j=l;j>0;) {
		   newArray[--numberOfDigits]=(int)j%10;	
			j=j/10;
		}
		
		System.out.println(Arrays.toString(newArray));
		
	}
}
