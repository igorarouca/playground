package com.igordaoconsulting.training.sorting;

class BubbleSort extends SortingAlgorithmUsingIntArray {

	BubbleSort(int[] input) {
		super(input);
	}

	public void run() {
		for (int pass = 0; pass < input.length - 2; ++pass)
			for (int i = 0; i < input.length - 1; ++i)
				if (input[i] > input[i + 1])
					swap(i, i + 1);
	}

}
