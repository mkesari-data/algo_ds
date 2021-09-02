package com.arraypractise;

public class StackClient {

	public static void main(String[] args) {
		StackUtil stack=new StackUtil();
		
		while(true) {
	
			System.out.println("1. Push 2. Pop 3.Exit");
			java.util.Scanner sc=new java.util.Scanner(System.in);
			int userOption=sc.nextInt();
			
			switch(userOption) {
			case 1 : 
				System.out.println("Enter your stack Value");
				double stackValue=sc.nextDouble();
				stack.push(stackValue);
				break;
			case 2 : 
				double retururedValue=-9;
				try {
					retururedValue = stack.pop();
				} catch (StackUnderFlowException e) {
					// TODO Auto-generated catch block
					System.out.println("Get Message is :"+e.getMessage());
					break;
				}
				System.out.println("Popped Value is:"+retururedValue);
				break;
			default:
				System.out.println("*** Its exiting **** ");
				return;
			}
			
		}
	
	}
}
