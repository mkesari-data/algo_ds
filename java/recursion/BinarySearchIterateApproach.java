package com.java.recursion;

import java.util.Iterator;

public class BinarySearchIterateApproach {

	public static void main(String[] args) {
		int[] a = { 2, 4, 6, 7, 8, 9, 12, 34 ,78};
		int searchValue = 78;
		int size = a.length;

		for (int start = 0, end = size;start<=end;) {
			int mideValue = (start + (end-start)/2) ;
			if (a[mideValue] == searchValue) {
				System.out.println(searchValue +":Found in:"+mideValue);
				break;
			} else if (a[mideValue] > searchValue) {
				end = mideValue - 1;
			} else {
				start = mideValue + 1;
			}
		}

	}
}
