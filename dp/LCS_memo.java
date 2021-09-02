package com.dp;

import java.util.*;

public class LCS_memo
{
   static int L[][];


   public static int solveLCS(int i, int j, String x, String y)
   {
      int sol1, sol2, sol3;


      if (i == 0 || j == 0)
      {
         return(0);
      }

      if ( L[i][j] >= 0 )
      {
         return( L[i][j] );
      }

      if ( x.charAt(i-1) == y.charAt(j-1) )
      {
         sol1 = solveLCS(i-1, j-1, x, y);

         L[i][j] = sol1 + 1;
         return( L[i][j] );
      }
      else
      {
         sol2 = solveLCS(i-1, j, x, y);
         sol3 = solveLCS(i, j-1, x, y);

         L[i][j] = (sol2 >= sol3) ? sol2 : sol3;

         return( L[i][j] );
      }
   }


   public static void main(String[] args)
   {

       Scanner in = new Scanner(System.in);

       String x;
       String y;
       int i, j, r;


       System.out.print("x = ");
       x = in.next();
       System.out.print("y = ");
       y = in.next();

       L = new int[x.length()+1][y.length()+1];

       /* ========================================
	  Initialzie L[][] array
	  ======================================== */
       for (i = 0; i < x.length()+1; i++)
          for (j = 0; j < y.length()+1; j++)
             L[i][j] = -1;

       r = solveLCS(x.length(), y.length(), x, y);

       System.out.println("Max length = " + r);

       System.out.println();
       System.out.println();

       System.out.println("L[][]:");
       System.out.print("     ");
       for (j = 0; j < y.length()+1; j++)
          System.out.print("  " + j);
       System.out.println();
       System.out.println("==================================");

       for (i = 0; i < x.length()+1; i++)
       {
          if ( i < 10 )
	     System.out.print(" ");
          System.out.print(" " + i + "  ");

          for (j = 0; j < y.length()+1; j++)
          {
	     if ( L[i][j] > 0 )
	        System.out.print("  ");
	     else
	        System.out.print(" ");
             System.out.print(L[i][j]);
	  }
          System.out.println();
       }
   }

}