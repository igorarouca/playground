package com.igordaoconsulting.training.sorting;

public abstract class SortingAlgorithm<T> implements Runnable {

	protected T input;

	protected SortingAlgorithm(T input) {
		if (input == null)
			throw new IllegalArgumentException("input cannot be null");

		this.input = input;
	}

}
