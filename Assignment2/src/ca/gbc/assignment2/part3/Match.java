package ca.gbc.assignment2.part3;
/***********************************
* COMP2080 - Assignment 2
* File name: Match.java
* Author: Dinatale, Corradina
* Email: corradina.dinatale@georgebrown.ca
************************************/
public class Match {

/**
 * Returns index i if array A contains an element A[i] such that A[i] = i.
 * If there exist many of such elements, return the index of any one of them.
 * Returns -1 if there exists no element A[i] such that A[i] == i.
 * n is the number of elements A contains.
 *
 * The running time of your algorithm is O(N).
 * You may add a brief explanation here if you wish.
 * 
 * @param A
 * @param n
 * @return
 */
public static int match( int[] A, int n ) 
{
    for(int i = 0; i < n; i++)
    { 
        if(A[i] == i) 
            return i; 
    } 
    return -1; 
} 

/**
 * Returns index i if array A contains an element A[i] such that A[i] = i.
 * If there exist many of such elements, return the index of any one of them.
 * Returns -1 if there exists no element A[i] such that A[i] == i.
 * n is the number of elements A contains.
 *
 * The running time of your algorithm is O(log n).
 * You may add a brief explanation here if you wish.
 * @param A
 * @param n
 * @return
 */
public static int match_rec( int[] A, int n )
{
	int start = 0;
	int end = n - 1;
	return match_r(A, start, end);

}

private static int match_r(int[] A, int start, int end) {
	
	if (start <= end) {
		int mid = (start + end) / 2;
		if (A[mid] == mid) //returns index if element == mid
			return mid;
		if (A[mid] < mid) // match might be on right half of array so try again with mid = mid + 1
			return match_r(A, mid + 1, end);
		else 
			return match_r(A, start, mid - 1); //match might be on left half of array so try again with mid = mid - 1
	}
	return -1; //match not found
}

} // end class

