import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


/**
 * 
 * This class calculates standard deviation of a given row of numbers
 * 
 * @author sumitchheda
 *
 */

public class StandardDeviation {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. 
         * Your class should be named Solution. */
    	Scanner scanner = new Scanner(System.in);
    	int numNums = scanner.nextInt();
    	double sumNums =0;
    	int[] nums = new int[numNums];
    	for (int i = 0; i<numNums; i++) {
    		nums[i] = scanner.nextInt();
    		sumNums += nums[i];
    	}
    	double mean = sumNums/numNums;
    	double sqDistance = 0;
    	for (int i:nums) {
    		sqDistance += Math.pow(i-mean, 2);
    	}
    	System.out.println(String.format("%.1f", Math.sqrt(sqDistance/numNums)));
    	scanner.close();
    }
}