import java.io.*;
import java.util.*;

public class StringReverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        boolean palindrome=true;
        for (int index=0; index<= A.length(); index++) {
        	int last = A.length()-index-1;
        	if (last <= index) {
        		break;
        	}
        	if (A.charAt(index)!= A.charAt(last)) {
        		palindrome=false;
        		break;
        	}
        }
        if (palindrome) {
        	System.out.println("Yes");
        } else {
        	System.out.println("No");
        }
        
    }
}



