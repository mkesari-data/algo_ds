package com.ds.scanner;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Name:");
		String name=sc.next();
		System.out.println("Entered Name:"+name);
		
		System.out.println("Enter Your Age:");
		int age=sc.nextInt();
		System.out.println("Entered Aged:"+age);
		
		System.out.println("Enter Your Salary:");
		double salary=sc.nextDouble();
		System.out.println("Entered Salary:"+salary);
	}
}
