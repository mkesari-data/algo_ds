package com.arraypractise;

public class ArraySizeExceed {

	public static void main(String[] args) {
		int[] a=new int[5];

		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		int i=0;
		while(true) {
			
			System.out.println("Enter Your input");
			int input=sc.nextInt();
			if(i<a.length) {
				a[i++]=input;	
			}
			else {
				System.out.println("Size Exceeded. I'm recreating new array");
				int[] b=new int[a.length*2];
				for (int j = 0; j < a.length; j++) {
					b[j]=a[j];
				}
				a=b;
				b=null;
				a[i++]=input;
			}
			
		}
		  
	
	}
}
