package com.igordaoconsulting.training.sorting;

class NaiveSort extends SortingAlgorithmUsingIntArray {

	NaiveSort(int[] input) {
		super(input);
	}

	public void run() {
		for (int i = 0; i < input.length - 1; ++i)
			swap(i, minIndex(i));
	}

	private int minIndex(int from) {
		int minIndex = from;

		for (int i = from + 1; i < input.length; ++i)
			if (input[i] < input[minIndex])
				minIndex = i;

		return minIndex;
	}

}
