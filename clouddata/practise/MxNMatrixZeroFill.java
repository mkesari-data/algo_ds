package com.clouddata.practise;

import java.util.ArrayList;
import java.util.List;

public class MxNMatrixZeroFill {
	
	public static void main(String[] args) {
		int[][] a=new int[][] {{2,3,4},{5,6,0},{85,3,40},{7,8,9}};
		
		System.out.println("Before Processing");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		fillRowsAndColsWithZeros(a);
		
		System.out.println("==================");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("double array length"+a.length);
		
		
		
		
	}
	private static void test(int[][] a) {
		a[1][1]=34;
	}
	
	private static void fillRowsAndColsWithZeros(int[][] a) {
		List<Integer> zeroRows=new ArrayList<Integer>();
		List<Integer> zeroCols=new ArrayList<Integer>();
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if(a[i][j]==0 && !zeroRows.contains(i)&& !zeroCols.contains(j)) {
					zeroRows.add(i);
					zeroCols.add(j);
					rowFillWithZero(a,i,a[i].length);
					columFillWithZero(a,j,a.length);
					break;
				}
			}
			System.out.println();
		}
		
	}
	
	private static void rowFillWithZero(int[][] a,int row,int colLength) {
		for(int i=0;i<colLength;i++)
			a[row][i]=0;
	}
	private static void columFillWithZero(int[][] a,int col,int rowLength) {
		for(int i=0;i<rowLength;i++)
			a[i][col]=0;
	}
}
