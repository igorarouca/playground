package com.igordaoconsulting.training.sorting;

class QuickSort extends SortingAlgorithmUsingIntArray {

	QuickSort(int[] input) {
		super(input);
	}

	public void run() {
		quickSort(0, input.length - 1);
	}

	private void quickSort(int lower, int upper) {
		if (lower < upper) {
			int middle = partition(lower, upper);
			quickSort(lower, middle - 1);
			quickSort(middle + 1, upper);
		}
	}

	/*
	 * Invariant:
	 * 	If lower <= k <= i, then input[k] <= pivot
	 * 	If i + 1 <= k <= j - 1, then input[k] > pivot 
	 * 	If k = upper, then input[upper] = pivot
	 */
	private int partition(int lower, int upper) {
		int pivot = input[upper];
		int middle = lower - 1; // middle is incremented as numbers are swapped between lower and upper halves

		for (int i = lower; i < upper; ++i)
			if (input[i] <= pivot) {
				++middle;
				swap(i, middle);
			}

		int pivotIndex = middle + 1; 
		swap(pivotIndex, upper);

		return pivotIndex;
	}
}
