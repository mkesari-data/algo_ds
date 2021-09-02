package com.clouddata.practise;

import java.util.Arrays;

public class OneEditAway {
	
	public static void main(String[] args) {
		String s1="mohan";
		String s2="mahan";
			
		System.out.println(isOneEditAway(s1, s2));
	}
	
	private static boolean isOneEditAway(String s1,String s2) {
		boolean isOneEditAway=true;
		boolean oneditUtilized=false;
		
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		for (char c : ch1) {
			System.out.print(c+"\t");	
		}
		System.out.println();	
		for (char c : ch2) {
			System.out.print(c+"\t");	
		}
		
		for(int i=0;i<ch1.length;i++) {
			char c1=ch1[i];
			if(c1==ch2[i])
				continue;
			else if(c1==ch2[i++] && !oneditUtilized){
				oneditUtilized=true;
				continue;
			}
			else {
				isOneEditAway=false;
			}
		}
		return isOneEditAway;
	}
	
}
