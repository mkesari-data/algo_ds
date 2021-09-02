package com.dp;

public class ArrayMaxSumNonAdjElements {

	private static  int findMaxSum(int[] arr,int index) {
		int inclSum;
		int exclSum;
		if(index>=arr.length)
			return 0;
		inclSum=findMaxSum(arr,index+2)+arr[index];
		exclSum=findMaxSum(arr,index+1);
		
		return Math.max(inclSum, exclSum);
		
	}
	
	public static void main(String[] args) {
		int arr[] = new int[]{5, 5, 10, 100, 10, 5,5, 5, 10, 100, 10, 5,5, 5, 10, 100, 10, 5,5, 5, 10, 100, 10, 5,5, 5, 10, 100, 10, 5,5, 5, 10, 100, 10, 5,5, 5, 10, 100, 10, 5,5, 5, 10, 100, 10, 5,5, 5, 10, 100, 10, 5,5, 5, 10, 100, 10, 5,5, 5, 10, 100, 10, 5,5, 5, 10, 100, 10, 5};
		int maxSum=findMaxSum(arr,0);
		System.out.println("Maximum Sum is :"+maxSum);
		
	}
}
