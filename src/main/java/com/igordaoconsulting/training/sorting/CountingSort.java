package com.igordaoconsulting.training.sorting;

import java.util.Arrays;

public class CountingSort extends SortingAlgorithmUsingIntArray {

	public CountingSort(int[] input) {
		super(input);
	}

	public void run() {
		int[] counter = new int[input.length];
		for (int i = 0; i < counter.length; ++i)
			++counter[input[i]];

		for (int i = 0; i < counter.length - 1; ++i)
			counter[i + 1] += counter[i];

		int[] clone = Arrays.copyOf(input, input.length);
		for (int i = input.length - 1; i >= 0; --i) {
			input[counter[clone[i]] - 1] = clone[i];
			--counter[clone[i]];
		}
	}

}
