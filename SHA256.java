import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.regex.*;

public class SHA256 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print 
         * output to STDOUT. Your class should be named Solution. */
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		StringBuffer sb = new StringBuffer();

		try {
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			md.update(inputString.getBytes());
			byte[] outputBytes = md.digest();
			for (byte b : outputBytes) {
				sb.append(String.format("%02x", b & 0xff));
			}
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(sb.toString());
		
		
		scanner.close();
    }
}