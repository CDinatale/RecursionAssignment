package ca.gbc.assignment2.part1;
/***********************************
 * COMP2080 - Assignment 2 
 * File name: Symmetric.java 
 * Author: Dinatale, Corradina
 * Email: corradina.dinatale@georgebrown.ca
 ************************************/
public class Symmetric {

	/**
	 * Returns true if array A is symmetric. Returns false otherwise. n is the
	 * number of elements A contains.
	 * 
	 * The running time of your algorithm is O(N). You may add a brief explanation
	 * here if you wish.
	 * 
	 * @param A
	 * @param n
	 * @return
	 */
	public static boolean symmetric(int[] A, int n) {
		return symm(A, n, 0);
	}
	
	private static boolean symm(int[] A, int n, int i) {

	    if (i > n/2)     
	        return true; // if i is past the midpoint, it means that every element in the first half of array is symmetrical to second half and array is symmetrical

	    else if (A[i] != A[n-1-i])    //if A[i] isn't equal to A[n-1-i] then array is not symmetrical
	        return false;

	    else    
	        return symm(A, n, i+1); // keep on testing array elements
	}
	
}
