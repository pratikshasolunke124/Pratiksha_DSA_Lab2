package com.gl.Q1.paymoney;

import java.util.*;

public class TransactionTarget {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of the transaction array");

		int size = sc.nextInt();
		int[] transactions = new int[size];

		System.out.println("Enter values of an array");

		for (int i = 0; i < size; i++) {
			transactions[i] = sc.nextInt();
		}

		System.out.println("Enter the total number of targets that needs to be achieved");
		int targetNo = sc.nextInt();

		for (int i = 0; i < targetNo; i++) {

			System.out.println("Enter value of the target");
			int target = sc.nextInt();

			int result = 0;
			int total = 0;

			for (int j = 0; j < size; j++) {

				result++;
				total += transactions[j];

				if (total > target)
					break;
			}

			if (total > target) {
				System.out.println("Target achieved after " + result + " transactions");
			} else {
				System.out.println("Given target is not achieved");
			}

		}

		sc.close();
	}

}
