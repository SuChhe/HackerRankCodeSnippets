import java.util.*;
import java.io.*;

/**
 * We use the integers a, b, n and  to create the following series:
 * (a+b*2^0),(a+b*2^0+b*2^1),(a+b*2^0+b*2^1+b*2^2),. . .,(a+b*2^0+b*2^1+. . .+b*2^n-1)
 * Sample input
 * 2
 * 0 2 10
 * 5 3 5
 * 
 * Sample output
 * 2 6 14 30 62 126 254 510 1022 2046
 * 8 14 26 50 98
 * @author sumitchheda
 *
 */

public class Loops2 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
        	long sum=a;
        	for (int innerCounter=0; innerCounter<n; innerCounter++) {
        		double newFactor=b*Math.pow(2, innerCounter);
        		long longNewFactor=new Double(newFactor).intValue();
        		sum += longNewFactor;
        		System.out.print(sum + " ");
        	}
        }
        in.close();
    }
    
    
}