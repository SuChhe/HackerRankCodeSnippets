import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 * Change mim number of digits to form magic square
 * as per my research a 3x3 magic square will have numbers from 1-9 (once each)
 * and each row or colum or diagonals will add up to number 15.
 * 
 * So if you actually calculate all, it may be easy to find which 
 * element needs to change.
 * @author sumitchheda
 *
 */

public class FormingAMagicSquare {

    // Complete the formingMagicSquare function below.
    static int formingMagicSquare(int[][] s) {
    	int[][] combinations = {{s[0][0],s[0][1],s[0][2]},
    			{s[1][0],s[1][1],s[1][2]},
    			{s[2][0],s[2][1],s[2][2]},
    			{s[0][0],s[1][0],s[2][0]},
    			{s[0][1],s[1][1],s[2][1]},
    			{s[0][2],s[1][2],s[2][2]},
    			{s[0][0],s[1][1],s[2][2]},
    			{s[0][0],s[1][1],s[2][0]}};
    	int[] sumCombinations= {s[0][0]+s[0][1]+s[0][2],
    			s[1][0]+s[1][1]+s[1][2],
    			s[2][0]+s[2][1]+s[2][2],
    			s[0][0]+s[1][0]+s[2][0],
    			s[0][1]+s[1][1]+s[2][1],
    			s[0][2]+s[1][2]+s[2][2],
    			s[0][0]+s[1][1]+s[2][2],
    			s[0][0]+s[1][1]+s[2][0]};
    	boolean[][] flags = new boolean[][] {{false,false,false},{false,false,false},
    		{false,false,false}};
    	
    	if (sumCombinations[0]== 15) {
    		flags[0][0]=true;
    		flags[0][1]=true;
    		flags[0][2]=true;
    	}
    	if (sumCombinations[1]==15) {
    		flags[1][0]=true;
    		flags[1][1]=true;
    		flags[1][2]=true;    		
    	}
    	if (sumCombinations[2]==15) {
    		flags[2][0]=true;
    		flags[2][1]=true;
    		flags[2][2]=true;
    	}
    	if (sumCombinations[3]==15) {
    		flags[0][0]=true;
    		flags[1][0]=true;
    		flags[2][0]=true;
    		
    	}
    	if (sumCombinations[4]==15) {
    		flags[0][1]=true;
    		flags[1][1]=true;
    		flags[2][1]=true;
    	}
    	if (sumCombinations[5]==15) {
    		flags[0][2]=true;
    		flags[1][2]=true;
    		flags[2][2]=true;
    		
    	}
    	if (sumCombinations[6]==15) {
    		flags[0][0]=true;
    		flags[1][1]=true;
    		flags[2][2]=true;
    		
    	}
    	if (sumCombinations[7]==15) {
    		flags[0][2]=true;
    		flags[1][1]=true;
    		flags[2][0]=true;
    	}
    	
   	System.out.println(Arrays.toString(sumCombinations));
    	return 0;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int[][] s = new int[3][3];

        for (int i = 0; i < 3; i++) {
            String[] sRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int sItem = Integer.parseInt(sRowItems[j]);
                s[i][j] = sItem;
            }
        }

        int result = formingMagicSquare(s);

        System.out.println(String.valueOf(result));

        scanner.close();
    }
}
