import java.io.*;
import java.util.*;


/**
 * String  is "hello" and  is "java".

A has a length of 5, and B has a length of 4; the sum of their lengths is 9. 
When sorted alphabetically/lexicographically, "hello" precedes "java"; 
therefore, A is not greater than B and the answer is No.

When you capitalize the first letter of both A and B and then print
 them separated by a space, you get "Hello Java".

 * @author sumitchheda
 *
 */

public class StringIntro {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());
        System.out.println(A.compareTo(B)>0?"Yes":"No");
        System.out.println(A.substring(0, 1).toUpperCase()+A.substring(1)+" "+
        		B.substring(0,1).toUpperCase()+B.substring(1));
    }
}



