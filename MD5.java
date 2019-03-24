import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

/**
 * 
 * 
 * MD5 (Message-Digest algorithm 5) is a widely-used cryptographic hash 
 * function with a 128-bit hash value. Here are some common uses for MD5:
 * 
 * To store a one-way hash of a password.
 * To provide some assurance that a transferred file has arrived intact.
 * 
 * MD5 is one in a series of message digest algorithms designed by Professor
 *  Ronald Rivest of MIT (Rivest, 1994); however, the security of MD5 has been 
 *  severely compromised, most infamously by the Flame malware in 2012. The 
 *  CMU Software Engineering Institute essentially considers MD5 to be
 *   "cryptographically broken and unsuitable for further use".
 *   
 *  https://en.wikipedia.org/wiki/MD5
 * 
 * @author sumitchheda
 *
 */
public class MD5 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		StringBuffer sb = new StringBuffer();

		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
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
