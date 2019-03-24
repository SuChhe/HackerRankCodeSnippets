import java.util.Scanner;
import java.util.regex.Pattern;


/***
 * 
 * Read https://www.regular-expressions.info/tutorialcnt.html
 * 
 * @author sumitchheda
 *
 */

class UsernameValidator {
    /*
     * Write regular expression here.
     */
    public static final String regularExpression = "^[a-zA-Z]\\w{7,29}";
    
    public UsernameValidator() {
    	Pattern p = Pattern.compile(regularExpression);
    }
}


public class UsernameRegex {
    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }
}