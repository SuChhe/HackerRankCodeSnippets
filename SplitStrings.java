import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SplitStrings {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int countIns = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i<countIns; i++) {
            String inString = scanner.nextLine();
            StringBuffer sb1 = new StringBuffer();
            StringBuffer sb2 = new StringBuffer();
            int counter = 0;
            for (char c: inString.toCharArray()) {
                if (counter%2==0) {
                    sb1.append(c);
                } else {
                    sb2.append(c);
                }
                counter++;
            }
            System.out.println (sb1.toString() +" "+ sb2.toString());
        }
    }
}