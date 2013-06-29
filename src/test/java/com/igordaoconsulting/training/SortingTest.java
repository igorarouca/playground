package com.igordaoconsulting.training;

import java.util.Arrays;
import java.util.Random;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.igordaoconsulting.training.util.ArrayUtils;

public class SortingTest {

	private static final int N = 100000;

	private String expected;
	private int[] unsorted;

	@Before
	public void initialize() {
		int[] array = sorted();
		this.expected = Arrays.toString(array);
		shuffle(array);
		this.unsorted = array;
	}

	@Test
	public void naiveSort() {
		ArrayUtils.naiveSort(unsorted);
		assertSorted(unsorted);
	}

	@Test
	public void insertionSort() {
		ArrayUtils.insertionSort(unsorted);
		assertSorted(unsorted);
	}

	@Test
	public void bubbleSort() {
		ArrayUtils.bubbleSort(unsorted);
		assertSorted(unsorted);
	}

	@Test
	public void mergeSort() {
		ArrayUtils.mergeSort(unsorted);
		assertSorted(unsorted);
	}

	@Test
	public void quickSort() {
		ArrayUtils.quickSort(unsorted);
		assertSorted(unsorted);
	}

	@Test
	public void heapSort() {
		ArrayUtils.heapSort(unsorted);
		assertSorted(unsorted);
	}

	@Test
	public void countingSort() {
		ArrayUtils.countingSort(unsorted);
		assertSorted(unsorted);
	}

	private static void shuffle(int[] array) {
		Random random = new Random();
		int middle = array.length / 2;
		for (int i = middle; i < array.length; ++i) {
			int index = random.nextInt(array.length);
			swap(array, i, index);
		}
	}

	private static void swap(int[] array, int i, int j) {
		int tmp = array[j];
		array[j] = array[i];
		array[i] = tmp;
	}

	private static int[] sorted() {
		int[] array = new int[N];
		for (int i = 0; i < N; ++i) array[i] = i;
		return array;
	}

	private void assertSorted(int[] array) {
		Assert.assertEquals(expected, Arrays.toString(array));
	}

}
