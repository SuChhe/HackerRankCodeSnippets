import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BinaryNumbers {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int consecutiveCounter=0;
        int maxConsecutive = 0;
        boolean firstTime=true;
        do {
            int remainder = n%2;
            n=n/2;
            if (firstTime) {
                if (remainder==1) { consecutiveCounter=1 ; }
                firstTime=false;
            } else {
            if (remainder ==1) {
                consecutiveCounter++;
            } else {
                consecutiveCounter=0;
            }
            }
            if (maxConsecutive < consecutiveCounter) {
                maxConsecutive = consecutiveCounter;
            }
        } while (n>=1);
        System.out.println(maxConsecutive);

        scanner.close();
    }
}
