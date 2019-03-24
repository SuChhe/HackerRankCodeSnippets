import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StaticBlock {
	private static int B, H;
	private static boolean flag;
	static {
		Scanner sc = new Scanner(System.in);
        B=sc.nextInt();
        H=sc.nextInt();
        flag=B>0 && H > 0;
        if (!flag) {
        	System.out.println("java.lang.Exception: Breadth and height must be positive");
        	System.exit(0);
        }
	}

	public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class}
