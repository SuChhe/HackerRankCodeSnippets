import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BalancedBrackets {

    // Complete the isBalanced function below.
    static String isBalanced(String s) {
        char[] brackets = s.toCharArray();
        Stack<Integer> myStack = new Stack<Integer> ();
        for (char bracket:brackets) {
            switch (bracket) {
            //{[()]}
                case '{':
                    myStack.push(1);
                    break;
                case '[':
                    myStack.push(2);
                    break;
                case '(':
                    myStack.push(3);
                    break;
                case '}':
                    if (myStack.isEmpty() || myStack.pop()!= 1)
                        return "NO";
                    else 
                        break;
                case ']':
                    if (myStack.isEmpty() || myStack.pop()!= 2)
                        return "NO";
                    else
                        break;
                case ')':
                    if (myStack.isEmpty() || myStack.pop()!= 3)
                        return "NO";
                    else 
                        break;
            }
        }
        
        if (myStack.isEmpty())
        	return "YES";
        else
        	return "NO";

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.nextLine();

            String result = isBalanced(s);

            System.out.println(result);
        }


        scanner.close();
    }
}
