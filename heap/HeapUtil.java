package com.heap;

public class HeapUtil {

	int[] a;
	int size = 0;
	int pos = 0;

	public HeapUtil(int size) {
		this.size = size;
		a = new int[size];
	}

	public void insert(int element) {
		a[++pos] = element;

		filterUp(pos);

	}

	/**
	 * 
	 * @param position
	 * 
	 *                 1. Copy the last element (pos) to delPos 2. reduce the size
	 *                 of 1 ( pos= pos-1) 3. if newly inserted node is smaller than
	 *                 its parent the filter up with delPos ( a[delPos] value >
	 *                 a[delPos/2] ) 4. else filterDown with delPos node.
	 */
	public void delete(int delPos) {
		System.out.println(a[delPos]+":Value overwriting with:"+a[pos]);
		a[delPos] = a[pos];
		pos = pos - 1;

		if (a[delPos] < a[delPos / 2]) {
			// filter up
			filterUp(delPos);
		} else if ( (a[delPos] > a[delPos * 2]) || (a[delPos] > a[(delPos * 2) + 1])) {
			// filterDown
			filterDown(delPos);
		}

	}

	 void filterDown( int k )
	   {
	      int child1, child2;
	      int help;

	      System.out.println("\nHeap before filter DOWN:");
	 

	      while ( 2*k <= pos )
	      {
	         child1 = 2*k;                 // Child1 = left  child of k
	         child2 = 2*k+1;               // Child2 = right child of k

	         if ( child2 <= pos )
	         {
	            /* ========================================
		       Node k has 2 children nodes....
		       Find the min. of 3 nodes !!!
		       ======================================== */
	            if ( a[k] < a[child1] && a[k] < a[child2] )
	            {
	               /* -------------------------------------------------------
			  Node k is in correct location... It's a heap. Stop... 
	                  ------------------------------------------------------- */
	               break;
	            }
		    else 
	            {
		        /* =========================================
			   Replace a[k] with the smaller child node
			   ========================================= */
	               if ( a[child1] < a[child2] )
	               {
	                  /* -------------------------------------------------
			     Child1 is smaller: swap a[k] with a[child1]
	                     ------------------------------------------------- */
	                  help = a[k];
	                  a[k] = a[child1];
	                  a[child1] = help;

	                  k = child1;         // Replacement node is now a[child1]
	               }
	               else
	               {
	                  /* -------------------------------------------------
			     Child2 is smaller: swap a[k] with a[child2]
	                     ------------------------------------------------- */
	                  help = a[k];
	                  a[k] = a[child2];
	                  a[child2] = help;

	                  k = child2;        // Replacement node is now a[child2]
	               }
	            }
	         }
	         else
	         {
	            /* ========================================
		       Node k only has a left child node
		       ======================================== */
	            if ( a[k] < a[child1] )
	            {
	               /* -------------------------------------------------------
			  Node k is in correct location... It's a heap. Stop... 
	                  ------------------------------------------------------- */
	               break;
	            }
		    else 
	            {
	               /* -------------------------------------------------------
			  Child1 is smaller: swap a[k] with a[child1]
	                  ------------------------------------------------------- */
	               help = a[k];
	               a[k] = a[child1];
	               a[child1] = help;

	               k = child1;         // Replacement node is now a[child1]
	            }
	         }
	      }
	   }

	private void filterUp(int pos) {
		/**
		 * 1. Get the parent index (pos/2) 2. Compare pos with pos/2. If pos value is
		 * lower value then swap it. else break 3. Make pos=pos/2; 4. Repeat this
		 * process until pos>1
		 * 
		 */
		int start = pos;

		while (start > 1) {

			int parent = start / 2;

			if (a[start] < a[parent]) {
				int temp = a[start];
				a[start] = a[parent];
				a[parent] = temp;
				start = parent;
			} else {
				break;
			}
		}

	}

	public void display() {
		for (int i = 1; i <= pos; i++) {
			System.out.print(a[i] + "\t");
		}
		System.out.println("\n");
	}
}
