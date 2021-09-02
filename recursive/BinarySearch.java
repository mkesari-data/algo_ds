package com.recursive;

public class BinarySearch {

	public static void main(String[] args) {
		int[] a = { 8, 9, 10, 11, 15, 19, 45, 67, 89, 90, 123, 234, 345 };
		int searchValue = 68;
		int searchPos = binarySearch(a, searchValue, 0, a.length - 1);
		System.out.println("Search Position:" + searchPos);
	}

	static int binarySearch(int[] arr,int searchValue,int startPos,int endPos) {
		
		/**
		 * Base condition. 
		 */
		if(startPos>endPos) {
			return -1;
		}
		
		int midPos=(startPos+endPos)/2;
		if(arr[midPos]==searchValue)
			return midPos;
		else if(searchValue<arr[midPos])
			return binarySearch(arr, searchValue, startPos, midPos-1);
		else
			return binarySearch(arr, searchValue, midPos+1, endPos);
	}
}
