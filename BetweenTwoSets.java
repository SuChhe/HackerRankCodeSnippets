import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class BetweenTwoSets {
	
	/*
	 * 
	 * You will be given two arrays of integers and asked to determine all integers that satisfy the following two conditions:

 The integer being considered is a factor of all elements of the second array
	 * 
	 */

    /*
     * Complete the getTotalX function below.
     */
    static int getTotalX(int[] a, int[] b) {
        /*
         * Write your code here.
         */return 0;

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[] nm = scan.nextLine().split(" ");

        int n = Integer.parseInt(nm[0].trim());

        int m = Integer.parseInt(nm[1].trim());

        int[] a = new int[n];

        String[] aItems = scan.nextLine().split(" ");

        for (int aItr = 0; aItr < n; aItr++) {
            int aItem = Integer.parseInt(aItems[aItr].trim());
            a[aItr] = aItem;
        }

        int[] b = new int[m];

        String[] bItems = scan.nextLine().split(" ");

        for (int bItr = 0; bItr < m; bItr++) {
            int bItem = Integer.parseInt(bItems[bItr].trim());
            b[bItr] = bItem;
        }

        int total = getTotalX(a, b);

        System.out.println(String.valueOf(total));
    }
}
