package com.search;

public class BinarySearch {

	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40, 50, 60 };
		int searchValue = 50;
//		int searchValue = Integer.parseInt(args[0]);
		int start = 0, end = a.length - 1, mid;

		boolean isValueFound = false;
		while (start <= end) {
			mid = start + (end - start) / 2;

			if (a[mid] == searchValue) {
				isValueFound = true;
				System.out.println(searchValue + ":Occured at:" + mid);
				break;
			} else if (a[mid] > searchValue) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}

		}

		if (!isValueFound) {
			System.out.println(searchValue + ": Not occured in your given array");
		}

	}

}
