import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;
import static java.lang.System.in;

/***
 * 
 * importing static variable "in" at package level
 * 
 * checking prime by dividing only until sqrt of input num.
 * 
 * @author sumitchheda
 *
 */

class Prime {
	public void checkPrime(int... vars) {
		for(int num:vars) {
			boolean primeFlag = true;
			if (num<2) {
				primeFlag = false;
			}
			int rootNum = (int)Math.sqrt(num);
			for (int i=2; i<=rootNum; i++) {
				if (num%i==0) {
					primeFlag = false;
					break;
				}
			}
			if (primeFlag) {
				System.out.print(num+" ");
			}
		}
		System.out.println();
	}
}



public class PrimeChecker {

	public static void main(String[] args) {
		try{
		BufferedReader br=new BufferedReader(new InputStreamReader(in));
		int n1=Integer.parseInt(br.readLine());
		int n2=Integer.parseInt(br.readLine());
		int n3=Integer.parseInt(br.readLine());
		int n4=Integer.parseInt(br.readLine());
		int n5=Integer.parseInt(br.readLine());
		Prime ob=new Prime();
		ob.checkPrime(n1);
		ob.checkPrime(n1,n2);
		ob.checkPrime(n1,n2,n3);
		ob.checkPrime(n1,n2,n3,n4,n5);	
		Method[] methods=Prime.class.getDeclaredMethods();
		Set<String> set=new HashSet<>();
		boolean overload=false;
		for(int i=0;i<methods.length;i++)
		{
			if(set.contains(methods[i].getName()))
			{
				overload=true;
				break;
			}
			set.add(methods[i].getName());
			
		}
		if(overload)
		{
			throw new Exception("Overloading not allowed");
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}

