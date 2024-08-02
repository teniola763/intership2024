import javax.swing.text.DateFormatter;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class DayCheck {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime current = LocalTime.now();

        System.out.println("Before formatting: " + LocalDate.now());
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");






        System.out.println("Today's Time is : " + LocalTime.of(current.getHour(), current.getMinute()));





    }
}


