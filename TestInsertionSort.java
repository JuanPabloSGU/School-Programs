import java.util.Scanner;

public class TestInsertionSort {

	public static void displayArray(int[] array){
		for (int i = 0; i< array.length; i++){
			System.out.print(array[i] + " " );
			
		}
		System.out.println("\n");
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numItems;
		int[] test;
		
		System.out.print("Enter number of elements: ");
		numItems = input.nextInt();
		
		/* populate array with random integers */
		test = new int[numItems];
		for (int i = 0; i < test.length; i++){
			test[i] = (int)(100 * Math.random());
		}
		System.out.println("Unsorted:");
		displayArray(test);
		
		Sorts.insertionSort(test);
		
		System.out.println("Sorted:");
		displayArray(test);
		
	}

}
