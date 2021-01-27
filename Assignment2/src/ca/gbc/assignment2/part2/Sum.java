package ca.gbc.assignment2.part2;

/***********************************
 * COMP2080 - Assignment 2 
 * File name: Sum.java 
 * Author: Dinatale, Corradina
 * Email: corradina.dinatale@georgebrown.ca
 ************************************/
public class Sum {

	/**
	 * Returns true if array A contains two elements whose sum is k. Returns false
	 * otherwise. n is the number of elements A contains.
	 *
	 * The running time of your algorithm is O(N). You may add a brief explanation
	 * here if you wish.
	 * 
	 * @param A
	 * @param n
	 * @param k
	 * @return
	 */
	public static boolean sum(int[] A, int n, int k) {

		int start = 0;
		int end = n - 1;

		while (start < end) {
			if (A[start] + A[end] == k) // if pair is found return true
				return true;
			else if (A[start] + A[end] < k) //if k is less than the sum of first element and last then start++
				start++;
			else
				end--; //if k is more than the sum of first element and last then end--
		}
		return false; // pair not found
	}

	/**
	 * RECURSIVE ALGORITHM Returns true if array A contains two elements whose sum
	 * is k. Returns false otherwise. n is the number of elements A contains.
	 *
	 * The running time of your algorithm is O(N). You may add a brief explanation
	 * here if you wish.
	 * 
	 * @param A
	 * @param n
	 * @param k
	 * @return
	 */
	public static boolean sum_rec(int[] A, int n, int k) {

		int start = 0;
		int end = n - 1;
		return sum_r(A, n, k, start, end);
	}

	private static boolean sum_r(int[] A, int n, int k, int start, int end) {
		if (start == end)
			return false;
		else if (A[start] + A[end] == k) //if pair is found return true
			return true;
		else if (A[start] + A[end] < k) // if k is less than the sum of first element and last then try again with start = start + 1
			return sum_r(A, n, k, start + 1, end);

		return sum_r(A, n, k, start, end - 1); //else try again with end = end - 1
	}

}
