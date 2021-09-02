package com.clouddata.practise;

import java.util.Random;
import java.util.Scanner;

/*
 * There are 2 bugs in this program. 
 * 1. doubleElementComparision -> for odd size getting indexoutofboundexception. Last element need to treat separately. 
 * 2. doubleElementComparision -> Min value not figuing out correctly. 
 * 
 */
public class MinMaxElement {

	public static void main(String[] args) {
		System.out.println("Enter size of array");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] a=new int[size];
		
		Random r=new Random();
		for (int i = 0; i < a.length; i++) {
			a[i]=r.nextInt(50);
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"\t");
		}

		singleElementComparision(a);
		doubleElementComparision(a);
	}
	
	private static void singleElementComparision(int[] a){
		int min,max=0;
		
		if(a[0]>a[1]) {
			min=a[1];
			max=a[0];
		}else {
			min=a[0];
			max=a[1];
		}
		
		for (int i = 2; i < a.length; i++) {
			if(a[i]<min) {
				min=a[i];
			}else if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("Min:"+min+":Max:"+max);
	}
	
	private static void doubleElementComparision(int[] a) {
	int min,max=0;
		
		if(a[0]>a[1]) {
			min=a[1];
			max=a[0];
		}else {
			min=a[0];
			max=a[1];
		}
		int lmin;
		int lmax;
		for (int i = 2; i < a.length; i+=2) {
			if(a[i]<a[i+1]  ) {
				lmin=a[i];
				lmax=a[i+1];
			}else {
				lmin=a[i+1];
				lmax=a[i];
			}
			if(min<lmin) {
				min=lmin;
			}
			if(lmax>max) {
				max=lmax;
			}
		}
		
		System.out.println("Min:"+min+":Max:"+max);
	}
}
