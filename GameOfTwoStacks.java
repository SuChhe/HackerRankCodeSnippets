import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class GameOfTwoStacks {

    /*
     * Complete the twoStacks function below.
     */
    static int twoStacks(int x, int[] a, int[] b) {
        /*
         * Write your code here.
         */
         int aIndex = 0;
         int bIndex = 0;
         int count=0;
         boolean aFlag;
         int subtrahand = 0;

        do {
            if (a[aIndex] < b[bIndex]) {
                subtrahand = a[aIndex];
                aFlag = true;
            } else {
                subtrahand=b[bIndex];
                aFlag=false;
            }
            if (x>subtrahand) {
                x -= subtrahand;
                int temp = (aFlag == true) ? aIndex++ : bIndex++;
                count++;
            } else {
                break;
            }
        } while (x>0 && aIndex < a.length && bIndex <b.length);
        while (aIndex<a.length) {
        	if (a[aIndex]<x) {
        		x -= a[aIndex];
        		count++;
        		aIndex++;
        	} else
        		break;
        }
        while (bIndex<b.length) {
        	if (b[bIndex]<x) {
        		x -= b[bIndex];
        		count++;
        		bIndex++;
        	} else
        		break;
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int g = Integer.parseInt(scanner.nextLine().trim());

        for (int gItr = 0; gItr < g; gItr++) {
            String[] nmx = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nmx[0].trim());

            int m = Integer.parseInt(nmx[1].trim());

            int x = Integer.parseInt(nmx[2].trim());

            int[] a = new int[n];

            String[] aItems = scanner.nextLine().split(" ");

            for (int aItr = 0; aItr < n; aItr++) {
                int aItem = Integer.parseInt(aItems[aItr].trim());
                a[aItr] = aItem;
            }

            int[] b = new int[m];

            String[] bItems = scanner.nextLine().split(" ");

            for (int bItr = 0; bItr < m; bItr++) {
                int bItem = Integer.parseInt(bItems[bItr].trim());
                b[bItr] = bItem;
            }

            int result = twoStacks(x, a, b);

            System.out.println(result);
        }
    }
}
