package com.dp;

class MaximumSum
{
	
	/*Function to return max sum such that no two elements
	are adjacent */
	int FindMaxSum(int arr[], int n)
	{
		int incl = arr[0];
		int excl = 0;
		int excl_new;
		int i;

		for (i = 1; i < n; i++)
		{
			/* current max excluding i */
			excl_new = (incl > excl) ? incl : excl;

			/* current max including i */
			incl = excl + arr[i];
			excl = excl_new;
		}

		/* return max of incl and excl */
		return ((incl > excl) ? incl : excl);
	}
	
	/*Function to return max sum such that no two elements
	are adjacent */
	int FindMaxSum2(int arr[], int n)
	{
		int inclusSum;int exclSum;
		if(n>=arr.length)
			return 0;
		inclusSum=FindMaxSum2(arr, n+2)+arr[n];
		exclSum=FindMaxSum2(arr, n+1);
		return Math.max(inclusSum, exclSum);
	}

	// Driver program to test above functions
	public static void main(String[] args)
	{
		MaximumSum sum = new MaximumSum();
		int arr[] = new int[]{1, 2, 9, 4, 5, 0, 4, 11, 6 ,1, 2, 9, 4, 5, 0, 4, 11, 6 ,1, 2, 9, 4, 5, 0, 4, 11, 6 ,1, 2, 9, 4, 5, 0, 4, 11, 6 ,1, 2, 9, 4, 5, 0, 4, 11, 6 ,1, 2, 9, 4, 5, 0, 4, 11, 6 };
		//System.out.println(sum.FindMaxSum2(arr, arr.length));
		System.out.println(sum.FindMaxSum2(arr,0));
	}
}

// This code has been contributed by Mayank Jaiswal
