import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MinAbsoluteDifference {

    // Complete the minimumAbsoluteDifference function below.
    static int minimumAbsoluteDifference(int[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int absDiff=Integer.MAX_VALUE;
        System.out.println(absDiff);
        int diff=0;
        for(int counter=0; counter<arr.length-1; counter++){
            diff=Math.abs(arr[counter+1]-arr[counter]);
            System.out.println("Difference of "+arr[counter+1]+" and "+arr[counter]+" is "+diff);
            if (diff<absDiff) {
            	absDiff=diff;
            }
            if (absDiff==0) {
            	break;
            }
        }

        return absDiff;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = minimumAbsoluteDifference(arr);

        System.out.println(String.valueOf(result));
        scanner.close();
    }
}
