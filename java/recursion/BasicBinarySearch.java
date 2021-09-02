package com.java.recursion;

public class BasicBinarySearch {

	public static void main(String[] args) {
		int[] a= {2,4,6,7,8,9,12,34};
		int searchValue = 2;
		
		int position=binarySearch(a,searchValue,0,a.length-1);
		System.out.println(searchValue+":Found In:"+position);
		
	}
	
	static int binarySearch(int[] a,int searchValue,int startPos,int endPos) {

      if(startPos>endPos) {
    	  return -2;
      }
		int midPos = (startPos + endPos) / 2;
		if (a[midPos] == searchValue)
			return midPos;
		else if (a[midPos] > searchValue) {
			endPos = midPos - 1;
		} else {
			startPos = midPos + 1;
		}
		return binarySearch(a, searchValue, startPos, endPos);
	}
}
