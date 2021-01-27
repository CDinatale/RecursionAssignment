package ca.gbc.assignment2.part4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class KthSmallestDriver {

	public static final int MAXSIZE = 500;

	public static void main(String[] args) {
		int n, i, k, value;
		int[] A = new int[MAXSIZE];

		File file = new File(System.getProperty("user.dir") + "\\src\\ca\\gbc\\assignment2\\part4\\kthsmallest.in");
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

		// Enter the element to search for
		k = input.nextInt();

		while (k > 0) {
			value = KthSmallest.find_kth_smallest(A, n, k);
			System.out.println("k = " + k + ", element = " + value);

			// Enter the next element to search for
			k = input.nextInt();

		} // end while

		// Sort array A to verify the above results.
		insertion_sort(A, n);
		for (i = 0; i < n; i++)
			System.out.print(A[i] + " ");
		System.out.println();

	} // end main

	private static void insertion_sort(int[] A, int n) {
		int p, j;
		for (p = 1; p < n; p++) {
			int tmp = A[p];
			for (j = p; j > 0 && tmp < A[j - 1]; j--)
				A[j] = A[j - 1];
			A[j] = tmp;
		}
	} // end insertion_sort

} // end class
