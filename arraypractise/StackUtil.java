package com.arraypractise;


public class StackUtil {

	double[] d;
	
	int tailPointer=-1;
	
	private int ARRAY_SIZE=3;
	
	
	StackUtil(int size){
		ARRAY_SIZE=size;
		d=new double[ARRAY_SIZE];
	}
	StackUtil(){
		d=new double[ARRAY_SIZE];
	}
	
	/**
	 * Push operation
	 */
	
	public void push(double value) {
		
		if(tailPointer>=(ARRAY_SIZE-1)) {
			System.out.println("Existing Stack size exceeded. So I am doubling. ");
			ARRAY_SIZE=ARRAY_SIZE*2;
			double[] tempArray=new double[ARRAY_SIZE];
			for (int i = 0; i < d.length; i++) {
				tempArray[i]=d[i];
			}
			d=tempArray;
		}
		
		d[++tailPointer] =value; 
		System.out.println("Your value inserted at "+(tailPointer));
	}

	/**
	 * Pop operation : Get and remove the last value in the array. 
	 */
	
	public double pop() throws StackUnderFlowException{
		if(tailPointer<=-1) 
			throw new StackUnderFlowException("Hey Your Stack is Empty");
		return d[tailPointer--];
		
	}
	
}
