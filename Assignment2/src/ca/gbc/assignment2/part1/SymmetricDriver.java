package ca.gbc.assignment2.part1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SymmetricDriver {

	public static final int MAXSIZE = 500;

	public static void main(String[] args) {
		int[] A;
		int n, i;
		A = new int[MAXSIZE];

		File file = new File(System.getProperty("user.dir") + "\\src\\ca\\gbc\\assignment2\\part1\\symm.in");
		Scanner input = null;
		try {
			input = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// Enter the number of array elements
		n = input.nextInt();
		while (n > 0) {
			// Enter n integers
			for (i = 0; i < n; i++)
				A[i] = input.nextInt();

			// Display the array for verification
			for (i = 0; i < n; i++)
				System.out.print(A[i] + " ");
			System.out.println();

			if (Symmetric.symmetric(A, n))
				System.out.println("YES");
			else
				System.out.println("NO");
			System.out.println();

			// Enter the number of elements of the next array
			n = input.nextInt();
		} // end while

	} // end main

} // end class
