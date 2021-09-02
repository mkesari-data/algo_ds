package com.heapify;

import java.util.Arrays;

public class MinHeap {

	int[] heapArray = new int[10];

	int index = 1;

	/**
	 * 1. Insert value at end of your array.
	 * 
	 * @param element
	 */
	public void insert(int element) {
		heapArray[index++] = element;
		topHeapify(index - 1);

	}

	/**
	 * 1. Replace position value with last elemnt in heap. 2. Compare position value
	 * with parent , if parent is smaller UpHeapify else , compare with childer , if
	 * childer is smaller BottomoHeapify. (left small or right small) else , it is
	 * in correct position
	 * 
	 * Boundary cases Yet to handle 1. Need to handle if root element deleted , if
	 * last element deletion and tree has only one element.
	 * 
	 * 
	 * @param position
	 */
	public void delete(int position) {
		heapArray[position] = heapArray[--index];
		/**
		 * 
		 */
		if (heapArray[position] < heapArray[position / 2] && (position/2)>0) {
			topHeapify(position);
		} else {

//			 * Boundary cases Yet to handle 1. Need to handle if root element deleted , if
//			 * last element deletion and tree has only one element.
//			 
			while ((position * 2) < index) {
				int leftChildPosition = position * 2;
				int rightChildPosition = (position * 2) + 1;

				if (heapArray[position] > heapArray[leftChildPosition]) {
					swap(heapArray, leftChildPosition, position);
					position=leftChildPosition;
				}

				else if (index >= rightChildPosition && (heapArray[position] > heapArray[rightChildPosition])) {
					swap(heapArray, rightChildPosition, position);
					position=rightChildPosition;
				} else {
					break;
				}
				
			}

		}

	}

	private void swap(int[] s, int pos1, int pos2) {
		int temp = s[pos1];
		s[pos2] = s[pos1];
		s[pos1] = temp;
	}

	/*
	 * 2. Get the parent of current node value parent= ( index/2) 3. Compare current
	 * value with parent. 3. if current value is smaller than parent then swap those
	 * two nodes. 4. else that element is in correct position
	 */
	private void topHeapify(int lindex) {
		int parent = lindex / 2;
		while (parent > 0) {
			if (heapArray[parent] > heapArray[lindex]) {
				/**
				 * Swap parent and current index
				 */
				int temp = heapArray[parent];
				heapArray[parent] = heapArray[lindex];
				heapArray[lindex] = temp;
				lindex = parent;
				parent = lindex / 2;
			} else {
				break;
			}

		}
	}

	public void display() {
		System.out.println(Arrays.toString(heapArray));
	}

}
