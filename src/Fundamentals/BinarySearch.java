package Fundamentals;

import java.util.Arrays;

import edu.princeton.cs.algs4.StdOut;

public class BinarySearch {

	public static int rank(int key, int[] a) {
		int lo = 0;
		int hi = a.length - 1;
		while (lo < hi) {
			int mid = lo + (hi - lo) / 2;
			if (key < a[mid]) {
				hi = mid - 1;
			} else if (key > a[mid]) {
				lo = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] whitelist = { 23, 54, 12, 63, 14, 25, 73, 13, 79, 5, 21, 9 };
		Arrays.sort(whitelist);
		for(int i=0;i<whitelist.length;i++) {
			StdOut.print(whitelist[i] + "  ");
		}
		StdOut.println();
		int key = 21;
		if (rank(key, whitelist) < 0) {
			StdOut.println(key);
		}
		else {
			StdOut.println(rank(key, whitelist));
		}
	}

}
