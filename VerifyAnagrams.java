import java.util.Arrays;
import java.util.Scanner;

public class VerifyAnagrams {
    static boolean isAnagram(String a, String b) {
        // Complete the function
    	if (a.length()!= b.length()) {
    		return false;
    	}
        a = a.toLowerCase();
        b = b.toLowerCase();
        int sum=0;
        int[] frequency =  new int['z'+1];
        for (int i=0; i<a.length(); i++) {
        	frequency[a.charAt(i)]++;
        	frequency[b.charAt(i)]--;
        }
        for (int i = 0 ; i<frequency.length; i++) {
        	if (frequency[i] !=0 )
        		return false;
        }
        System.out.println(sum);
        return true;

    }
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
