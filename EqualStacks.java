import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class EqualStacks {

    /*
     * Complete the equalStacks function below.
     */
    static int equalStacks(int[] h1, int[] h2, int[] h3, 
        int ht1, int ht2, int ht3) {
        /*
         * Write your code here.
         */
         int h1Size = 0;
         int h2Size = 0;
         int h3Size = 0;

         while (h1Size < h1.length && h2Size < h2.length && h3Size < h3.length) {
             if (ht1 > ht2 || ht1 > ht3) {
                 ht1 -= h1[h1Size];
                 h1Size++;
             }
             else if (ht2 > ht1 || ht2 > ht3) {
                 ht2 -= h2[h2Size];
                 h2Size++;
             }
             else if (ht3 > ht1 || ht3 > ht2) {
                 ht3 -= h3[h3Size];
                 h3Size++;
             } else {
                 break;
             }
             System.out.println("H1="+ht1+" H2="+ht2+" H3="+ht3);
             System.out.println("H1size="+h1Size+" H2size="+h2Size+" H3size="+h3Size);
          }
         LinkedList <Integer> ll = new LinkedList<Integer>();
         ll.add(ht1);
         ll.add(ht2);
         ll.add(ht3);
         return Collections.min(ll);
         
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[] n1N2N3 = scanner.nextLine().split(" ");

        int n1 = Integer.parseInt(n1N2N3[0].trim());

        int n2 = Integer.parseInt(n1N2N3[1].trim());

        int n3 = Integer.parseInt(n1N2N3[2].trim());

        int[] h1 = new int[n1];
        int height1 = 0;

        String[] h1Items = scanner.nextLine().split(" ");

        for (int h1Itr = 0; h1Itr < n1; h1Itr++) {
            int h1Item = Integer.parseInt(h1Items[h1Itr].trim());
            h1[h1Itr] = h1Item;
            height1 += h1Item;
        }

        int[] h2 = new int[n2];
        int height2 = 0;

        String[] h2Items = scanner.nextLine().split(" ");

        for (int h2Itr = 0; h2Itr < n2; h2Itr++) {
            int h2Item = Integer.parseInt(h2Items[h2Itr].trim());
            h2[h2Itr] = h2Item;
            height2 += h2Item;
        }

        int[] h3 = new int[n3];
        int height3 = 0;

        String[] h3Items = scanner.nextLine().split(" ");

        for (int h3Itr = 0; h3Itr < n3; h3Itr++) {
            int h3Item = Integer.parseInt(h3Items[h3Itr].trim());
            h3[h3Itr] = h3Item;
            height3 += h3Item;
        }

        int result = equalStacks(h1, h2, h3, height1, height2, height3);

        System.out.println(result);

    }
}
