import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Loops1 {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int[] numbers={1,2,3,4,5,6,7,8,9,10};
            
        for(int number:numbers) {
        	System.out.println(N+" x "+number+ " = "+ (N*number));
        }

        scanner.close();
    }
}
