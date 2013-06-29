package com.igordaoconsulting.training.sorting;

class MergeSort extends SortingAlgorithmUsingIntArray {

	MergeSort(int[] input) {
		super(input);
	}

	public void run() {
		mergeSort(0, input.length - 1);
	}

	private void mergeSort(int lower, int upper) {
		if (lower < upper) {
			int middle = (lower + upper) / 2;
			mergeSort(lower, middle);
			mergeSort(middle + 1, upper);
			merge(lower, middle, upper);
		}
	}

	private void merge(int lower, int middle, int upper) {
		int n1 = middle - lower + 1;
		int n2 = upper - middle;

		int[] lowerHalf = new int[n1 + 1];
		int[] upperHalf = new int[n2 + 1];

		for (int i = 0; i < n1; ++i)
			lowerHalf[i] = input[lower + i];
		lowerHalf[n1] = Integer.MAX_VALUE; // sentinel added to avoid having to check if the array is empty

		for (int i = 0, j = middle + 1; i < n2; ++i)
			upperHalf[i] = input[i + j];
		upperHalf[n2] = Integer.MAX_VALUE; // sentinel added to avoid having to check if the array is empty

		for (int i = 0, j = 0, k = lower; k <= upper; ++k)
			if (lowerHalf[i] <= upperHalf[j]) {
				input[k] = lowerHalf[i];
				++i;
			} else {
				input[k] = upperHalf[j];
				++j;
			}
	}

}
