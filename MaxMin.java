import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MaxMin {

    // Complete the maxMin function below.
    static int maxMin(int k, int[] arr) {
    	Arrays.sort(arr);
        int minDiff=arr[k-1];
        for (int counter=0; counter<=arr.length-k; counter++) {
            int diff=arr[counter+k-1]-arr[counter];
            if (minDiff > diff){
                minDiff=diff;
            }
        }
        return minDiff;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int arrItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            arr[i] = arrItem;
        }

        int result = maxMin(k, arr);

        System.out.println(String.valueOf(result));

        scanner.close();
    }
}
