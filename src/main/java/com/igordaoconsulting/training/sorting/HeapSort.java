package com.igordaoconsulting.training.sorting;

class HeapSort extends SortingAlgorithmUsingIntArray {

	private MaxHeap heap;

	HeapSort(int[] input) {
		super(input);

		// The heap is tied to the HeapSort input.
		// The nested class was created just to organize the code (separate the data-structure from the algorithm)
		this.heap = new MaxHeap();
	}

	public void run() {
		for (int i = heap.size() - 1; i >= 1; --i) {
			swap(0, i);
			heap.decrementSize();
			heap.maxHeapify(0);
		}
	}

	/*
	 * Nested class representing a Binary Max Heap
	 * Max-Heap Property: array[parent(index)] >= array[index]
	 */
	private class MaxHeap {

		private int size;

		MaxHeap() {
			this.size = input.length;
			heapifyInput();
		}

		private void heapifyInput() {
			// Loop through all non-leaf nodes and max-heapify them
			for (int i = (input.length / 2) - 1; i >= 0; --i)
				maxHeapify(i);
		}

		void decrementSize() {
			--size;
		}
	
		int size() {
			return size;
		}

		void maxHeapify(int index) {
			int left = leftChild(index);
			int right = rightChild(index);
			int largest = index;

			if (left < size && input[left] > input[index])
				largest = left;

			if (right < size && input[right] > input[largest])
				largest = right;

			if (largest != index) {
				swap(index, largest);
				maxHeapify(largest);
			}
			
		}

		private int leftChild(int i) {
			return (i << 1) + 1;
		}

		private int rightChild(int i) {
			return leftChild(i) + 1;
		}
		
	}

}
