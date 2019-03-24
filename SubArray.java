import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SubArray {
	
	public static int countNegSums(int[] ints) {
		int retCounter=0;
		for (int subArraySize=0; subArraySize<ints.length; subArraySize++) {
			for (int counter=0; counter<ints.length-subArraySize; counter++) {
				int subCount = 0;
				for (int i = 0; i <= subArraySize ; i++) {
					subCount += ints[counter+i];
				}
				if (subCount<0) {
					retCounter++;
				}
			}
		}
		
		return retCounter;
	}

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. 
         * Your class should be named Solution. */
    	Scanner scanner = new Scanner(System.in);
    	int numIntegers = scanner.nextInt();
    	int[] integers = new int[numIntegers];
    	for (int i=0; i<numIntegers; i++) {
    		integers[i]=scanner.nextInt();
    	}
    	System.out.println(Arrays.toString(integers));
    	
    	System.out.println(countNegSums(integers));
    	
    	scanner.close();
    }
}