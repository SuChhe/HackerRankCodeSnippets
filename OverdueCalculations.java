import java.io.*;
import java.util.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class OverdueCalculations {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner (System.in);
        int d1 = scanner.nextInt();
        int m1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int d2 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        
        int diffy = y1 - y2;
        int diffm = m1 - m2;
        int diffd = d1 - d2;
        //System.out.println(diffy+" " +diffm+" "+diffd);
        
      /*  int fine = 0;
        if (diffy > 0 ) {
            fine = 10000;
        } else if (diffm > 0) {
            fine = 500*diffm;
        } else if ( diffd > 0) {
            fine = 15*diffd;
        }
        System.out.println(fine);*/
        LocalDate dateExpected = LocalDate.of(y2, m2, d2);
        LocalDate dateReturned = LocalDate.of(y1, m1, d1);

        long fine = 0;
        
        if(dateReturned.isAfter(dateExpected)) {
        	System.out.println("Date differs");

            if ( dateExpected.getYear() == dateReturned.getYear() ) {
                if (dateExpected.getMonth() == dateReturned.getMonth()) {
                    long differenceDays = ChronoUnit.DAYS.between(dateExpected, dateReturned);
                    fine = 15 * differenceDays;
                } else {
                    long differenceMonths = ChronoUnit.MONTHS.between(dateExpected, dateReturned);
                    fine = 500 * differenceMonths;
                }
            } else {
                fine = 10000;
            }
        }
        System.out.println(fine);
    }
        
}