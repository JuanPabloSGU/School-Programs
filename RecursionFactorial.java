import java.util.Scanner;

public class RecursionFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.print("Input a number to find the factorial: ");
		int number = input.nextInt();

		recursion(number);

		int x = recursion(number);
		System.out.print("This is the factorial: " + x);

		input.close();

	}

	/* Returns the factorial on an integer using recursion.
	 * pre : number is given.
	 * post : Factorial is return of the given integer.
	 */
	public static int recursion(int number) {

		int result;

		if (number == 0) {
			result = 1;
		} else {
			result = number * (number - 1);
		}

		return (result);
	}

}
