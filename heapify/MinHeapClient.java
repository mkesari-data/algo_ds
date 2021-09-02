package com.heapify;

public class MinHeapClient {

	public static void main(String[] args) {
		MinHeap h=new MinHeap();
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.println("Enter value to insert");
			int n=sc.nextInt();
			h.insert(n);
			h.display();
		}
	}
}
