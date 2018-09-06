import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BreakingTheRecords {
	/*
	 * Maria plays college basketball and wants to go pro. Each season 
	 * she maintains a record of her play. She tabulates the number of 
	 * times she breaks her season record for most points and least points 
	 * in a game. Points scored in the first game establish her record 
	 * for the season, and she begins counting from there.
	 * 
	 * Sample Input
	 * 9
	 * 10 5 20 20 4 5 2 25 1
	 * 
	 * Sample Output
	 * 2 4
	 * 
	 * Sample Input
	 * 10
	 * 3 4 21 36 10 28 35 5 24 42
	 * 
	 * Sample Output
	 * 4 0
	 */

    // Complete the breakingRecords function below.
    static int[] breakingRecords(int[] scores) {
    	int highSoFar=scores[0];
    	int lowSoFar=highSoFar;
        int newHighCount=0;
        int newLowCount=0;
        for (int scoreCounter=1; scoreCounter<scores.length; scoreCounter++) {
        	int newScore=scores[scoreCounter];
        	if (newScore>highSoFar) {
        		newHighCount++;
        		highSoFar=newScore;
        	} else if (newScore<lowSoFar) {
        		newLowCount++;
        		lowSoFar=newScore;
        	}
        }
        return new int [] {newHighCount, newLowCount};


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[n];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int[] result = breakingRecords(scores);

        for (int i = 0; i < result.length; i++) {
            System.out.println(String.valueOf(result[i]));

            if (i != result.length - 1) {
                System.out.print(" ");
            }
        }

        System.out.println();;

        scanner.close();
    }
}
