import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class GradingStudents {
	/**
	 * Grade students
	 * - Every student receives a grade in the inclusive range from 0 to 100.
	 * - Any grade less than 40 is a failing grade
	 * Sam is a professor at the university and likes to round each student's  according to these rules:
	 * - If the difference between the grade and the next multiple of 5 is less than 3, round  up to the next multiple of 5.
	 * - If the value of grade is less than 38, no rounding occurs as the result will still be a failing grade.
	 * 
	 * @param grades
	 * @return
	 */

    /*
     * Complete the gradingStudents function below.
     */
    static int[] gradingStudents(int[] grades) {
        /*
         * Write your code here.
         */
        int[] newGrades = new int[grades.length];
        int counter = 0;
        for (int grade:grades){
            if (grade <=37){
                newGrades[counter]=grade;
            }
            else {
                if ( (grade+1)%5==0 ) {
                    newGrades[counter]=grade+1;    
                } else if ( (grade+2)%5==0 ) {
                    newGrades[counter]=grade+2;
                } else {
                    newGrades[counter]=grade;
                }
            }
            counter++;
        }
        return newGrades;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scan.nextLine().trim());

        int[] grades = new int[n];

        for (int gradesItr = 0; gradesItr < n; gradesItr++) {
            int gradesItem = Integer.parseInt(scan.nextLine().trim());
            grades[gradesItr] = gradesItem;
        }

        int[] result = gradingStudents(grades);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bw.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bw.write("\n");
            }
        }

        bw.newLine();

        bw.close();
    }
}
