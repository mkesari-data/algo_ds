package com.heap;
import java.util.Scanner;

public class HeapClient {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	      int  a[] = {50, 30, 70, 10, 5, 7, 40, 45, 80};

	      
	      
	      HeapUtil x = new HeapUtil( 100 );

	      for ( int i = 0; i < a.length; i++ ) 
	      {
	         System.out.println("Insert: " + a[i] );
	         x.insert( a[i] );
	         x.display();
	      }
	      
	      while(true) {
	    	  System.out.println("Enter Position to delete");
	    	  int delPos=in.nextInt();
		      x.delete( delPos );
		      x.display();
	      }
	      
	}

}
