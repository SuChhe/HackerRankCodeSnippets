import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DateAndTime {
	public static String getDay(int day, int month, int year) {
		//LocalDate date = LocalDate.of(year, month, day);
		//String dayofWeek=date.getDayOfWeek().toString();
		return LocalDate.of(year,  month,  day).getDayOfWeek().toString();

			
	}
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        int day = in.nextInt();
        int year = in.nextInt();
        
        System.out.println(getDay(day, month, year));
    }
}
