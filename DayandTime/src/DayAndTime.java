import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class DayAndTime {
    public static void main(String[] args) {
        System.out.println(findDay(10,8,2022));

    }
    public static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month -1, day);

        String nameOfDay = calendar.getDisplayName(Calendar.DAY_OF_WEEK,Calendar.LONG,  Locale.US);
        return nameOfDay;

    }
}
