package com.gl.Q2.denomination;

public class BubbleSort implements IntegerSorting {
	public void sort(int[] array) {

		for (int i = 0; i < array.length; i++) {

			for (int j = i; j < array.length - 1 - i; j++) {

				if (array[j] < array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

}
