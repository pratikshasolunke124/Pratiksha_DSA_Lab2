package com.gl.Q2.denomination;

public class NotesCount {
	public void calculateNotesCount(int[] sortedDenominations, int amount) {

		int[] notesCount = new int[sortedDenominations.length]; 
		try {
			for (int i = 0; i < sortedDenominations.length; i++) {
				if (sortedDenominations[i] <= amount) {
					notesCount[i] = amount / sortedDenominations[i];
					// amount = amount - (sortedDenominations[i] * notesCount[i]);
					amount = amount % sortedDenominations[i];
					if (amount == 0) {
						break;
					}
				}
			}

			if (amount == 0) {
				System.out.println("In order to give minimum number of notes, pay :" );
				for (int i = 0; i < sortedDenominations.length; i++) {
					if (notesCount[i] > 0) {
						System.out.println( notesCount[i] + " note (s) of " +sortedDenominations[i]);
					}
				}
			} else {
				System.out.println("Entered amount cannot be paid using mentioned currency denominations");
			}
		} catch (ArithmeticException ae) {
			System.out.println("Zero is not a valid denomination");
		}
	}
}
