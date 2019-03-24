import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class InterQuartiles {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. 
         * Your class should be named Solution. */
    	
        Scanner scanner = new Scanner (System.in);
        int numNums = scanner.nextInt();
        int[] nums = new int[numNums];
        int[] weights = new int[numNums];
        for (int i=0; i<numNums; i++) {
            nums[i]= scanner.nextInt();
        }
        int finalArraySize=0;
        for (int i=0; i<numNums; i++) {
            weights[i]= scanner.nextInt();
            finalArraySize += weights[i];
        }
        //System.out.println(Arrays.toString(nums));
        //System.out.println(Arrays.toString(weights));


        int internalCounter=0;
        int [] finalArray = new int[finalArraySize];
        for (int i=0; i<finalArraySize;) {
        	for (int j=0; j<weights[internalCounter]; j++  ) {
        		finalArray[i++] = nums[internalCounter];
        	}
        	internalCounter++;
        }
        Arrays.sort(finalArray);
        
        int[] lowerHalf = new int[finalArraySize/2];
        for (int i=0; i<finalArraySize/2; i++) {
        	lowerHalf[i]=finalArray[i];
        }
        int[] upperHalf = new int[finalArraySize/2];
        if (finalArraySize%2==0) {
        for (int i=0; i<finalArraySize/2; i++) {
        	upperHalf[i]=finalArray[i+finalArraySize/2];
        }
        } else {
            for (int i=0; i<finalArraySize/2; i++) {
            	upperHalf[i]=finalArray[1+i+finalArraySize/2];
            }
        }
        double lowerMedian = findMedian(lowerHalf);
        double upperMedian = findMedian(upperHalf);

        System.out.println(String.format("%.1f",upperMedian-lowerMedian));
    }
    
    public static double findMedian (int[] nums) {
        //System.out.println(Arrays.toString(nums));
    	int retVal =0;
    	int size = nums.length;
    	retVal = (size%2==0) ? 
    			(nums[(size/2)]+nums[(size-1)/2])/2:
    			(nums[(size/2)]);
    	return retVal;
    }
}