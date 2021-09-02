package com.greddy;

import java.util.Arrays;

public class MaxHeightPyramic {

	public static void main(String[] args) {

		int[] a = new int[25];
		java.util.Random r = new java.util.Random();
		for (int i = 0; i < a.length; i++) {
			a[i] = r.nextInt(10);
		}
		System.out.println("Before Sort:" + Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("After Sort:" + Arrays.toString(a));

		int maxHeight = constructPyramicHeight(a);
		System.out.println("Max Height is :" + maxHeight);
	}

	public static int constructPyramicHeight(int[] a) {
		int prevLevelWeight=a[0];
		int prevLevelNoOfElements=1;
		int height=1;
		
		int tempWeight=0;
		int tempNoofElements=0;
		
		for (int i = 1; i < a.length; i++) {
			
			tempWeight+=a[i];
			tempNoofElements+=1;
			if(tempWeight>prevLevelWeight && tempNoofElements> prevLevelNoOfElements) {
				height+=1;
				prevLevelWeight=tempWeight;
				prevLevelNoOfElements=tempNoofElements;
				tempWeight=0;
				tempNoofElements=0;
			}
		}
		return height;
	}
}
