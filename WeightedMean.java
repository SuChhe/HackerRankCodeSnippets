import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Weighted mean provides weights for each number. Its like numbers are repeated
 * by the weights provided for them
 * E.g. input
 * 
 * 5
 * 10 40 30 50 20
 * 1 6 3 4 2
 * 
 * 
 * Weighted mean = ( 10*1 + 40*6 + 30*3 + 50*4 + 20*2 ) / ( 1+6+3+4+2)
 * 
 * @author sumitchheda
 *
 */

public class WeightedMean {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner (System.in);
        int numNums = scanner.nextInt();
        long sumNums = 0;
        int sumWeights =0;
        int[] nums = new int[numNums];
        for (int i = 0; i<numNums; i++) {
            nums[i] = scanner.nextInt();
        }
        for (int i = 0; i<numNums; i++) {
            int weight = scanner.nextInt();
            sumWeights += weight;
            sumNums += (weight*nums[i]);
        }
        System.out.println(String.format("%.1f", (double)sumNums/sumWeights));
    }
}