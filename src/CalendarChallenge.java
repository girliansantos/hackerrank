import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarChallenge {
    public static String findDay(int year, int month, int date){
        String day = "";
        Calendar c = Calendar.getInstance();
        c.set(year, month-1, date);
        switch(c.get(Calendar.DAY_OF_WEEK)){
            case 1: day = "SUNDAY";
            case 2: day = "MONDAY";
            case 3: day = "TUESDAY";
            case 4: day = "WEDNESDAY";
            case 5: day = "THURSDAY";
            case 6: day = "FRIDAY";
            case 7: day = "SATURDAY";
        }
        return day;
    } 
}