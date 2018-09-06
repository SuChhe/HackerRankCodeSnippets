import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class GreedyFlorist {

    // Complete the getMinimumCost function below.
    static int getMinimumCost(int k, int[] c) {
    	Arrays.sort(c);
    	int retVal=0;
    	int calculationRound=1;
    	int personCounter=0;
    	for (int counter = c.length-1; counter >= 0; counter--) {
    		personCounter++;
    		retVal += (c[counter] * calculationRound);
    		System.out.println(c[counter] +" and "+retVal);
    		if (personCounter ==k) {
    			personCounter = 0;
    			calculationRound++ ;
    		}
    	}
    	return retVal;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int minimumCost = getMinimumCost(k, c);

        System.out.println(String.valueOf(minimumCost));

        scanner.close();
    }
}
