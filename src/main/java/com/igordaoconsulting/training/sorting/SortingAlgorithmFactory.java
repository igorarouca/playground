package com.igordaoconsulting.training.sorting;

public class SortingAlgorithmFactory {

	private static SortingAlgorithmFactory instance = new SortingAlgorithmFactory();

	public static SortingAlgorithmFactory getInstance() {
		return instance;
	}

	private SortingAlgorithmFactory() {}

	public SortingAlgorithm<int[]> naiveSort(int[] unsorted) {
		return new NaiveSort(unsorted);
	}

	public SortingAlgorithm<int[]> insertionSort(int[] unsorted) {
		return new InsertionSort(unsorted);
	}

	public SortingAlgorithm<int[]> bubbleSort(int[] unsorted) {
		return new BubbleSort(unsorted);
	}

	public SortingAlgorithm<int[]> mergeSort(int[] unsorted) {
		return new MergeSort(unsorted);
	}

	public SortingAlgorithm<int[]> heapSort(int[] unsorted) {
		return new HeapSort(unsorted);
	}

	public SortingAlgorithm<int[]> quickSort(int[] unsorted) {
		return new QuickSort(unsorted);
	}

	public SortingAlgorithm<int[]> countingSort(int[] unsorted) {
		throw new RuntimeException("Not Implemetend Yet!");
	}

	public SortingAlgorithm<int[]> radixSort(int[] unsorted) {
		throw new RuntimeException("Not Implemetend Yet!");
	}

	public SortingAlgorithm<int[]> bucketSort(int[] unsorted) {
		throw new RuntimeException("Not Implemetend Yet!");
	}

}
