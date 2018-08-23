import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Anagrams {


	    // Complete the sherlockAndAnagrams function below.
	    static int sherlockAndAnagrams(String s) {
	        HashMap<String, Integer> map = new HashMap<String, Integer>();

	        // Keep track of how many anagrams we've seen
	        int count = 0;

	        // Generate all substrings (N^2)
	        for(int outer = 0 ; outer < s.length(); outer++)
	        {
	            for(int inner=outer+1 ; inner <= s.length(); inner++)
	            {
	                String currentSubString = s.substring(outer,inner);

	                // Sort all characters in strings
	                char[] chars = currentSubString.toCharArray();
	                Arrays.sort(chars);
	                currentSubString = String.valueOf(chars);

	                // Check if the sorted strings match?
	                if(map.containsKey(currentSubString)) 
	                {
	                    // Check how many times we've seen it and add that amount to the count
	                    int value = map.get(currentSubString);
	                    count=count+value;

	                    // Increment the times we've seen the string
	                    map.put(currentSubString, value+1);
	                } 
	                else 
	                {
	                    // Never seen it before = insert and set to 1 to indiciate we've now seen it
	                    map.put(currentSubString, 1);
	                }
	            }
	        }
	        return count;
	    }
	    
	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {

	        int q = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int qItr = 0; qItr < q; qItr++) {
	            String s = scanner.nextLine();

	            int result = sherlockAndAnagrams(s);

	            System.out.println(String.valueOf(result));
	        }

	        scanner.close();
	    }
	}

