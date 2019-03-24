import java.io.*;
import java.util.*;
import java.math.*;

/**
 * One uses BigInteger when numbers may be very large in size to 
 * fit in available default data types e.g. 200 digits long
 * 
 * BigInteger is part of Math package.
 * 
 * @author sumitchheda
 *
 */

public class UsingBigInteger {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner (System.in) ; 
        BigInteger  a = new BigInteger(scanner.nextLine());
        BigInteger b = new BigInteger(scanner.nextLine());
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
        
    }
}