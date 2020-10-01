/*
 * Sorts.java
 * A class that implements sorting algorithms.
 */
 
 public class Sorts {
 	
	/**
	 * Sorts an array of data from low to high
	 * pre: none
	 * post: items has been sorted from low to high
	 */
	public static void selectionSort(int[] items) {
		
		for (int index = 0; index < items.length; index++) {
			for (int subIndex = index; subIndex < items.length; subIndex++) {
				if (items[subIndex] < items[index]) {
					int temp = items[index];
					items[index] = items[subIndex];
					items[subIndex] = temp;
				}
			}	
		}
	}
	
	
	/**
	 * Sorts an array of objects from low to high
	 * pre: none
	 * post: objects have been sorted from low to high
	 */
	public static void selectionSort(Comparable[] items) {
		
		for (int index = 0; index < items.length; index++) {
			for (int subIndex = index; subIndex < items.length; subIndex++) {
				if (items[subIndex].compareTo(items[index]) < 0) {
					Comparable temp = items[index];
					items[index] = items[subIndex];
					items[subIndex] = temp;
				}
			}	
		}
	}

	
	/**
	 * Sorts an array of integer from low to high
	 * pre: none
	 * post: Integers have been sorted from low to high
	 */
	public static void insertionSort(int[] items) {
		int temp, previousIndex;
		
		for (int index = 1; index < items.length; index++) {	//start with second item
			temp = items[index];
			previousIndex = index - 1;
			while ((items[previousIndex] > temp) && (previousIndex > 0)) {
				items[previousIndex + 1] = items[previousIndex];
				/* decrease index to compare current item to next previous item */
				previousIndex -= 1;
			}
			if (items[previousIndex] > temp) {
				/* shift item in first element up into next element position */
				items[previousIndex + 1] = items[previousIndex];
				/* place current item at index 0 (first element) */
				items[previousIndex] = temp;
			} else {
				/* place current item at index ahead of previous item */
				items[previousIndex + 1] = temp;
			}
		}
	}

	
	/**
	 * Sorts an array of integer from low to high
	 * pre: none
	 * post: Integers have been sorted from low to high
	 */
	public static void insertionSort(Comparable[] items) {
		int previousIndex;
		
		for (int index = 1; index < items.length; index++) {	//start with second item
			Comparable temp = items[index];
			previousIndex = index - 1;
			while ((items[previousIndex].compareTo(temp) > 0 ) && (previousIndex > 0)) {
				items[previousIndex + 1] = items[previousIndex];
				/* decrease index to compare current item to next previous item */
				previousIndex -= 1;
			}
			if (items[previousIndex].compareTo(temp) > 0 ) {
				/* shift item in first element up into next element position */
				items[previousIndex + 1] = items[previousIndex];
				/* place current item at index 0 (first element) */
				items[previousIndex] = temp;
			} else {
				/* place current item at index ahead of previous item */
				items[previousIndex + 1] = temp;
			}
		}
	}
	
	/**
	 * Merges two sorted portion of items array
	 * pre: items[start..mid] is sorted. items[mid+1..end] sorted.
	 * start <= mid <= end
	 * post: items[start..end] is sorted.
	 */
	private static void merge(int[] items, int start, int mid, int end) {
		int[] temp = new int[items.length];
		int pos1 = start;
		int pos2 = mid + 1;
		int spot = start;
		
		while (!(pos1 > mid && pos2 > end)) {
			if ((pos1 > mid) || ((pos2 <= end) && (items[pos2] < items[pos1]))) {
				temp[spot] = items[pos2];
				pos2 += 1;
			} else {
				temp[spot] = items[pos1];
				pos1  += 1;
			}
			spot += 1;
		}
		/* copy values from temp back to items */
		for (int i =  start; i <= end; i++) {
			items[i] = temp[i];
		}
		
	}



	/**
	 * Sorts items[start..end]
	 * pre: start > 0, end > 0
	 * post: items[start..end] is sorted low to high
	 */
	public static void mergesort(int[] test, int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			mergesort(test, start, mid);
			mergesort(test, mid + 1, end);
			merge(test, start, mid, end);
		}
	}

	/**
	 * Searches items array for goal
	 * pre: items is sorted from low to high
	 * post: Position of goal has been returned, 
	 * or -1 has been returned if goal not found.
	 */
	public static int binarySearch(int[] items, int start, int end, int goal) {
		
		if (start > end) {
			return(-1);
		} else {
			int mid = (start + end) / 2;
			if (goal == items[mid]) {
				return(mid);
			} else if (goal < items[mid]) {
				return(binarySearch(items, start, mid-1, goal));
			} else {
				return(binarySearch(items, mid+1, end, goal));
			}
		}
	}

	
	
}
