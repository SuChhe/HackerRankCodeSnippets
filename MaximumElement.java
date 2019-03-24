import java.io.*;
import java.util.*;
	
public class MaximumElement {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner (System.in);
        int numQueries = scanner.nextInt();
        Stack<Integer> myStack = new Stack<Integer> ();
        
        while (numQueries>0) {
        	numQueries--;
        	int queryType = scanner.nextInt();
        	if (queryType == 1) {
        		int data = scanner.nextInt();
        		if (!myStack.empty())
        			data = data > myStack.peek() ? data : myStack.peek(); 
        		myStack.push(data);
        	}
        	if (queryType  == 2) {
        		myStack.pop ();
        	}
        	if (queryType == 3) {
        		System.out.println(myStack.peek()); 
        	}
        }
        scanner.close();
        
    }
    

}

