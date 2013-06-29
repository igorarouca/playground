package com.igordaoconsulting.training.sorting;


abstract class SortingAlgorithmUsingIntArray extends SortingAlgorithm<int[]> {

	SortingAlgorithmUsingIntArray(int[] input) {
		super(input);

		if (input.length == 0)
			throw new IllegalArgumentException("input cannot be empty");
	}

	void swap(int i, int j) {
		int tmp = input[i];
		input[i] = input[j];
		input[j] = tmp;
	}

}
