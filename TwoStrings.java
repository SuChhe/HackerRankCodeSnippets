
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class TwoStrings {

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
    	boolean[] presence=new boolean[('z'+1)];
        String retString="NO";
	    for (int counter = 0; counter<s1.length(); counter++){
	    	char temp1=s1.charAt(counter);
	        presence[temp1]=true;
	    }
	    for (int counter=0; counter<s2.length(); counter++) {
	    	char temp2=s2.charAt(counter);
	        if (presence[temp2]) {
                retString="YES";
	        	break;
	        }
	    }
        return retString;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int qItr = 0; qItr < q; qItr++) {
	            String s1 = scanner.nextLine();

	            String s2 = scanner.nextLine();

	            String result = twoStrings(s1, s2);

	            System.out.println(result);
	        }

	        scanner.close();
    }
}
