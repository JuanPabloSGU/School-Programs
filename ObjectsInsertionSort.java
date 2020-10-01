import java.util.Scanner;

public class ObjectsInsertionSort {

	public static void displayArray(String[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + "  ");
		}
		System.out.println("\n");
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int numObjects;
		String[] test;

		System.out.print("Enter number of words: ");
		numObjects = input.nextInt();
		input.nextLine(); // clear the buffer

		/* populate array with String objects */
		test = new String[numObjects];
		for (int i = 0; i < test.length; i++) {
			System.out.print("Enter word:");
			test[i] = input.nextLine();
		}
		System.out.println("Unsorted:");
		displayArray(test);

		Sorts.insertionSort(test);

		System.out.println("Sorted:");
		displayArray(test);

		input.close();
	}
}