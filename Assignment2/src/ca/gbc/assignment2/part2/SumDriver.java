package ca.gbc.assignment2.part2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SumDriver {

	public static final int MAXSIZE = 500;

	public static void main(String[] args) {
		int n, i, k;
		int[] A = new int[MAXSIZE];

		File file = new File(System.getProperty("user.dir") + "\\src\\ca\\gbc\\assignment2\\part2\\sum.in");
		Scanner input = null;
		try {
			input = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// Input the number of array elements
		n = input.nextInt();

		// Input the array elements
		for (i = 0; i < n; i++)
			A[i] = input.nextInt();

		// Display the array for verification
		for (i = 0; i < n; i++)
			System.out.print(A[i] + " ");
		System.out.println();

		// Enter the sum to search for
		k = input.nextInt();

		while (k > 0) {
			// Call the exhaustive method
			if (Sum.sum(A, n, k))
				System.out.println("Exhaustive: YES" + " " + k);
			else
				System.out.println("Exhaustive: NO" + " " + k);

			// Call the recursive method
			if (Sum.sum_rec(A, n, k))
				System.out.println("Recursive : YES" + " " + k);
			else
				System.out.println("Recursive : NO" + " " + k);

			// Enter the next sum to search for
			k = input.nextInt();

		} // end while

	} // end main

} // end class
