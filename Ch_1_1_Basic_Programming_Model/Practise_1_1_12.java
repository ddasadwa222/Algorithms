package Ch_1_1_Basic_Programming_Model;

import edu.princeton.cs.algs4.*;

public class Practise_1_1_12 {
	public static void main(String[] args) {
		int[] a = new int[10];
		for(int i = 0; i < 10; i++)
			a[i] = 9 - i;
		for(int i = 0; i < 10; i++)
			a[i] = a[a[i]];
		for(int i = 0; i < 10; i++)
			StdOut.print(a[i] + " ");
	}
	// output :
	/*
	 * 0 1 2 3 4 4 3 2 1 0 
	 */
}
