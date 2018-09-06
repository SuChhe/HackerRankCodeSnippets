import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CatsAndMouse {
	/* Two cats chase a mouse in single line
	 * x, y, z positions
	 * x=Cat A position
	 * y=Cat B position
	 * z=Mouse c position
	 * 
	 * if cat A and cat B are equidistance from mouse - they reach mouse at 
	 * same time - they fight and mouse escape
	 * if cat A and Cat B are at different distance from mouse - one of them
	 * catches the mouse
	 * 
	 * print Cat A or Cat B or Mouse C for the three different options
	 * 
	 */

    // Complete the catAndMouse function below.
    static String catAndMouse(int x, int y, int z) {
    	int catADistance = Math.abs(z-x);
    	int catBDistance = Math.abs(z-y);
    	System.out.println("Cat A Distance ="+catADistance);
    	System.out.println("Cat B Distance ="+catBDistance);
    	if (catADistance > catBDistance) {
    		return "Cat B";
    	} else if (catBDistance > catADistance) {
    		return "Cat A";
    	} else {
    		return "Mouse C";
    	}
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] xyz = scanner.nextLine().split(" ");

            int x = Integer.parseInt(xyz[0]);

            int y = Integer.parseInt(xyz[1]);

            int z = Integer.parseInt(xyz[2]);

            String result = catAndMouse(x, y, z);

            System.out.println(result);
        }


        scanner.close();
    }
}
