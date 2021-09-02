package com.sort;

import java.util.Arrays;
import java.util.Random;

public class InsertionSort {

	public static void main(String[] args) {
		int[] a = new int[10];
		Random r = new Random(100);
		for (int i = 0; i < 10; i++) {
			a[i] = r.nextInt(100);
		}
		System.out.println("Beore Sorting" + Arrays.toString(a));
		insertionSort(a);
		System.out.println("After Sorting" + Arrays.toString(a));
	}
	
	public static void insertionSort(int[] a) {

		
		
		for (int i = 1; i < a.length; i++) {

			for (int j = i-1; j >= 0; j--) {
				/**
				 * Compare j and j+1 position values , if j is higher value -> Then swap it.
				 */
				if (a[j+1] < a[j ]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}else {
					break;
				}
			}
		}

	}
}
