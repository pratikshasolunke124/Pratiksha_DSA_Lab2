package com.gl.Q2.denomination;

public class MergeSort implements IntegerSorting {

	public void sort(int[] array) {

		sort(array, 0, array.length - 1);
	}

	private void sort(int[] array, int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;

			sort(array, left, mid);
			sort(array, mid + 1, right);
			merge(array, left, mid, right);
		}
	}

	private void merge(int[] array, int left, int mid, int right) {

		int n1 = mid - left + 1;
		int n2 = right - mid;

		int[] leftArray = new int[n1];
		int[] rightArray = new int[n2];

		for (int i = 0; i < n1; i++) {
			leftArray[i] = array[left + i];
		}

		for (int j = 0; j < n2; j++) {
			rightArray[j] = array[mid + j + 1];
		}

		int i = 0, j = 0, k = left;
		// Sorting left and right array and storing in actual array
		while (i < n1 && j < n2) {

			if (leftArray[i] >= rightArray[j]) {

				array[k] = leftArray[i];
				i++;

			} else {
				array[k] = rightArray[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			array[k] = leftArray[i];

			i++;
			k++;
		}

		while (i < n2) {
			array[k] = rightArray[j];

			j++;
			k++;
		}
	}
}
