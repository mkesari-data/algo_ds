package com.dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CoinChange {

	public static void main(String[] args) {

		int[] denominations = { 3, 5, 6, 7 };

		int amount = 11;

		int answer = resolveMinDenominations(denominations, amount, 0);
		System.out.println("Min Denominations:" + answer);

	}

	private static int resolveMinDenominations(int[] denominations, int amount, int coins) {


		java.util.List<Integer> al = new ArrayList<Integer>();

		for (int i = 0; i < denominations.length; i++) {

			if (denominations[i] < amount) {
				amount -= denominations[i];
				coins += 1;
			}

			if (amount == 0) {
				return coins;
			} else {
				al.add(resolveMinDenominations(denominations, amount, coins));
			}

		}
		
		Collections.sort(al);
		return al.get(0);

	}
}
