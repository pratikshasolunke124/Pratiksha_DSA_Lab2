package com.gl.Q2.denomination;

import java.util.*;

public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the currency denominations");
		int domSize = sc.nextInt();

		int[] denominations = new int[domSize];

		System.out.println("Enter the value of currency denominations");
		for (int i = 0; i < domSize; i++) {
			denominations[i] = sc.nextInt();
		}

		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();

		IntegerSorting sorting = new MergeSort();
		NotesCount counting = new NotesCount();

		// descending order sorting of denomination
		sorting.sort(denominations);

		// notes count to pay amount
		counting.calculateNotesCount(denominations, amount);

		sc.close();
	}

}
