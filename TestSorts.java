import java.util.Scanner;

public class TestSorts {

	public static void displayArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "  ");
		}
		System.out.println("\n");
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int numItems;
		int[] test;

		System.out.print("Enter number of elements: ");
		numItems = input.nextInt();

		/* populate array */
		test = new int[numItems];
		for (int i = 0; i < test.length; i++) {
			test[i] = (int) (101 * Math.random());
		}
		System.out.println("Unsorted:");
		displayArray(test);

		Sorts.selectionSort(test);

		System.out.println("Sorted:");
		displayArray(test);
		
//		To test Merge Sort
//		public static void main(String[] args) {
//			Scanner input = new Scanner(System.in);
//			int numItems;
//			int[] test;
//			
//			System.out.print("Enter number of elements: ");
//			numItems = input.nextInt();
//			
//			/* populate array with random integers */
//			test = new int[numItems];
//			for (int i = 0; i < test.length; i++){
//				test[i] = (int)(100 * Math.random());
//			}
//			System.out.println("Unsorted:");
//			displayArray(test);
//			
//			Sorts.mergesort(test,0,test.length-1); 
//			
//			System.out.println("Sorted:");
//			displayArray(test);
//			
//		}

		
//		/**
//		  * Sort algorithms are tested.
//		  */
//
//		 import java.util.Scanner;
//		 
//		 public class TestSorts {
//
//		 	public static void displayArray(int[] array) {
//		 		for (int i = 0; i < array.length; i++) {
//		 			System.out.print(array[i] + "  ");
//		 		}
//		 		System.out.println("\n");
//		 	}
//
//		 	public static void sortIntArray() {
//				Scanner input = new Scanner(System.in);
//				int numItems, searchNum, location;
//				int[] test;
//
//				System.out.print("Enter number of elements: ");
//				numItems = input.nextInt();
//
//				/* populate array */
//				test = new int[numItems];
//				for (int i = 0; i < test.length; i++) {
//					test[i] = (int)(101 * Math.random());
//				}
//				System.out.println("Unsorted:");
//				displayArray(test);
//
//				//Sorts.selectionSort(test);
//				//Sorts.insertionSort(test);
//				Sorts.mergesort(test, 0, test.length - 1);
//
//				System.out.println("Sorted:");
//				displayArray(test);
//
//				/* search for number in sorted array */
//				System.out.print("Enter a number to search for: ");
//				searchNum = input.nextInt();
//				while (searchNum != -1){
//					location = Searches.binarySearch(test, 0, test.length-1, searchNum);
//					System.out.println("Number at position: " + location);
//					System.out.print("Enter a number to search for: ");
//					searchNum = input.nextInt();
//				}
//		  	}
//
//
//		public static void main(String[] args) {
//				sortIntArray();
//			}
//		}


	}
}
