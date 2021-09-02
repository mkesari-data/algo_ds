package com.java.recursion;


public class TowersOfHonnoi {
	public static void main(String[] args) {
		System.out.println("Enter Number of Disks-> ");
		int numberOfDisks = new java.util.Scanner(System.in).nextInt();
		String steps=towerofHanoi(numberOfDisks, 1, 3);
		System.out.println(numberOfDisks+"Tower of Honoi steps are:"+steps);
	}

	static String towerofHanoi(int numberOfDisks, int sourcePoll, int targetPoll) {
		String result="";
		/**
		 * Base Condition. If only one disk move from soruce to Target
		 */
		if (numberOfDisks == 1)
			return sourcePoll + " -> " + targetPoll + "\n";
		else {
			int helperPoll = 6 - sourcePoll - targetPoll;
			String sol1 = towerofHanoi(numberOfDisks - 1, sourcePoll, helperPoll);
			String mysol=sourcePoll + " -> " + targetPoll + "\n";
			String sol2 = towerofHanoi(numberOfDisks - 1, helperPoll, targetPoll);
			result=sol1+mysol+sol2;
		}

		return result;
	}

}
