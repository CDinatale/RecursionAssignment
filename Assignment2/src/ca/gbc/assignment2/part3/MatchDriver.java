package ca.gbc.assignment2.part3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MatchDriver {
	public static final int MAXSIZE = 500;

	public static void main(String[] args) {
		int[] A = new int[MAXSIZE];
		int n, i, index;

		File file = new File(System.getProperty("user.dir") + "\\src\\ca\\gbc\\assignment2\\part3\\match.in");
		Scanner input = null;
		try {
			input = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// Enter the number of array elements
		n = input.nextInt();

		while (n > 0) {
			// Input the array elements
			for (i = 0; i < n; i++)
				A[i] = input.nextInt();

			// Display the array for verification
			for (i = 0; i < n; i++)
				System.out.print(A[i] + " ");
			System.out.println();

			// Call the exhaustive method
			index = Match.match_rec(A, n);
			System.out.print("Exhaustive: ");
			if (index >= 0)
				System.out.print("A[" + index + "]" + " = " + A[index]);
			else
				System.out.print("No match.");
			System.out.println();

			// Call the divide-and-conquer method
			index = Match.match(A, n);
			System.out.print("Div & conq: ");
			if (index >= 0)
				System.out.print("A[" + index + "]" + " = " + A[index]);
			else
				System.out.print("No match.");
			System.out.println();
			System.out.println();

			// Input the number of elements of the next array
			n = input.nextInt();

		} // end while

	} // end main

} // end class
