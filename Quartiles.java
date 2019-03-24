import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


/**
 * 
 * This class calculates Quartiles from a given set of integers.
 * Quartiles has three values - one is median, the other two are medians of the 
 * lower half and upper half of data set from the first median.
 * 
 * @author sumitchheda
 *
 */
public class Quartiles {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner (System.in);
        int numNums = scanner.nextInt();
        int[] nums = new int[numNums];
        for (int i=0; i<numNums; i++) {
            nums[i]= scanner.nextInt();
        }
        Arrays.sort(nums);
        
        int[] lowerHalf = new int[numNums/2];
        for (int i=0; i<numNums/2; i++) {
        	lowerHalf[i]=nums[i];
        }
        int[] upperHalf = new int[numNums/2];
        if (numNums%2==0) {
        for (int i=0; i<numNums/2; i++) {
        	upperHalf[i]=nums[i+numNums/2];
        }
        } else {
            for (int i=0; i<numNums/2; i++) {
            	upperHalf[i]=nums[1+i+numNums/2];
            }
        }
        System.out.println(findMedian(lowerHalf));
        System.out.println(findMedian(nums));
        System.out.println(findMedian(upperHalf));
    }
    
    public static double findMedian (int[] nums) {
        System.out.println(Arrays.toString(nums));
    	int retVal =0;
    	int size = nums.length;
    	retVal = (size%2==0) ? 
    			(nums[(size/2)]+nums[(size-1)/2])/2:
    			(nums[(size/2)]);
    	return retVal;
    }
}