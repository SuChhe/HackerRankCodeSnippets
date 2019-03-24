import java.io.*;
import java.util.*;

public class StringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] splits=s.split("[ !,?._'@+,]");
        int counter=0;
        StringBuffer buffer = new StringBuffer(); 
        for(String a:splits) {
        	if (! a.equals("") && !a.equals(" ")) {
        		counter++;
        		buffer.append(a);
        		buffer.append("\n");		
        	}
        }
        System.out.println(counter+"\n"+buffer);
        // Write your code here.
        scan.close();
    }
}

