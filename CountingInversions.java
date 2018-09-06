import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CountingInversions {

    // Complete the countInversions function below.
	/** This program counts the min number of swaps an element may have to do in order to be in 
	 * correct position in a sorted array given that sorting algorithm is merge sort.
	 * 
	 **/
    static long countInversions(int[] arr) {
        int[] temp = new int[arr.length];
        return mergeSort(arr, temp, 0, arr.length-1);
    }
    
    static long mergeSort(int[]arr, int[]temp, int leftStart, int rightEnd) {
    	//System.out.println("Sorting "+Arrays.toString(arr)+" position left="+leftStart+" and right="+rightEnd);
        long retVal = 0L;
        if (leftStart >= rightEnd){
            return retVal;
        }
        int middle=(leftStart+rightEnd)/2;
        //sort left
        retVal += mergeSort(arr, temp, leftStart, middle);
        //sort Right
        retVal += mergeSort(arr, temp, middle+1, rightEnd);
        // merge
        retVal += mergeHalves(arr, temp, leftStart, middle, middle+1, rightEnd, middle);
        return retVal;
    }
    
    static long mergeHalves(int[] source, int temp[], int leftStart, int leftEnd, int rightStart, int rightEnd, int middle){
    	//System.out.println("Merging between "+leftStart+" and "+rightEnd);
        int size = rightEnd - leftStart + 1;
        
        int left = leftStart;
        int right=rightStart;
        int index=leftStart;
        long retVal=0;
        
        while (left<=leftEnd && right <= rightEnd) {
            if (source[left]<=source[right]) {
                temp[index] = source[left];
                left++;
            } else{
            	// the idea here is that how much did you move the element from the right half array
            	// the distance from the middle (or left End) to the place where the element was moved
            	// E.G. if the left half of array is 5 unit and we moved the first element from right array
            	// to first position in the resultant array (because that element is smallest)
            	// we count it as 5 swaps as per following calculations.
            	// further when the merged array is further merged, if the element moves more, the 
            	// swaps are counted further.
            	retVal += middle - left +1;
                temp[index]=source[right];
                right++;
            }
            index++;
        }
        System.arraycopy(source, left, temp, index, leftEnd-left+1);
        System.arraycopy(source, right, temp, index, rightEnd-right+1);
        System.arraycopy(temp, leftStart, source, leftStart, size);
        //System.out.println("RetVal="+retVal);
        return retVal;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] arr = new int[n];

            String[] arrItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            //System.out.println(Arrays.toString(arrItems));
            for (int i = 0; i < n; i++) {
                int arrItem = Integer.parseInt(arrItems[i]);
                arr[i] = arrItem;
            }
            

            long result = countInversions(arr);

            System.out.println(String.valueOf(result));
        }

        scanner.close();
    }
}
