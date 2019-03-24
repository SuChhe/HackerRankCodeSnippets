import java.io.*;
import java.util.*;

/**
 * This class calculates and prints first Mean, then Median and then Mode of 
 * input set
 * 
 * input - count and then list of numbers/integers
 * output - mean, median and then mode
 * 
 * @author sumitchheda
 *
 */

public class MeanModeMedian {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner (System.in);
        int numNums = scanner.nextInt();
        int[] nums = new int[numNums];
        long numSum = 0;
        Map <Integer, Integer> map = new HashMap <Integer,Integer>();
        for (int i = 0; i<numNums; i++) {
            nums[i] = scanner.nextInt();
            numSum += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        Arrays.sort(nums);
        System.out.println((double)numSum/(double)numNums);
        if (numNums % 2 ==0) {
            System.out.println(((double)nums[(numNums-1)/2] + (double)nums[(numNums+1)/2]) / 2);
        } else {
            System.out.println(nums[numNums/2]);
        }
        int maxCount = Collections.max(map.values());
        for (int i = 0; i<numNums; i++) {
            if (map.get(nums[i])== maxCount) {
                System.out.println(nums[i]);
                break;
            }
        }
    }
}