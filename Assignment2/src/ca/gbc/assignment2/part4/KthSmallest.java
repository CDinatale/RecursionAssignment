package ca.gbc.assignment2.part4;

import java.util.Arrays;

/***********************************
 * COMP2080 - Assignment 2 
 * File name: kthsmallest.java 
 * Author: Dinatale, Corradina
 * Email: cora.dinatale@georgebrown.ca
 ************************************/
public class KthSmallest {

	public static final int MaxSize = 500;

	/**
	 * Return the value of the kth smallest element of array A. n is the number of
	 * elements A contains, and k <= n.
	 * 
	 * The running time of your algorithm must be O(n).
	 * 
	 * @param A
	 * @param n
	 * @param k
	 * @return
	 */
	public static int find_kth_smallest(int[] A, int n, int k) {

		int start = 0;
		int end = n - 1;

		return kth_smallest(A, start, end, n, k);

	}

	private static int kth_smallest(int[] A, int left, int right, int n, int k) {

		if (k > 0 && k <= n) {
			int pos = part(A, left, right); //partition array and get pivot pos
			if (pos - left == k - 1) //if pos = k return element
				return A[pos];
			if (pos - left > k - 1) //if pos > k try again with left part of array
				return kth_smallest(A, left, pos - 1, n, k);
			return kth_smallest(A, pos + 1, right, n , k - pos + left - 1); //else try again with right
		}

		return -1; 

	}

	private static int part(int[] A, int left, int right) {

		int x = A[right];
		int i = left;

		for (int j = left; j < right; j++) {
			if (A[j] <= x) {
				swap(A, i, j);
				i++;
			}
		}

		swap(A, i, right);

		return i;

	}

	private static void swap(int[] A, int i, int right) {
		
		int temp = A[i];
		A[i] = A[right];
		A[right] = temp;
		
	}

}