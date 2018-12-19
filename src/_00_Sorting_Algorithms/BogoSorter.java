package _00_Sorting_Algorithms;

import java.util.Random;

public class BogoSorter extends Sorter {
	public BogoSorter() {
		type = "Bogo";
		Random random = new Random();
	}
	
	// Bogo sort is a joke sorting algorithm. It is considered the most 
	// inefficient sorting algorithm while still maintaining the possibility
	// of eventually sorting data.
	
	// It works by following these steps:
	// STEP 1. Is the array in order?
	//	if yes, finished; if no, go to step 2.
	// STEP 2. Take two random elements in the array and swap them.
	// STEP 3. Go back to step 1.
	
	//1. Complete the sort method using the Bogo sort algorithm. 
	@Override
	void sort(int[] arr, SortingVisualizer display) {
		if(!intArraySorted(arr)) {
			Random random = new Random();
			int i = random.nextInt(arr.length);
			int j = random.nextInt(arr.length);
			int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
		}
	}
	public boolean intArraySorted(int[] arr) {
		boolean sorted = true;
		int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1])
                {
                    return false;
                }
            }
        }
		return sorted;
	}
}
