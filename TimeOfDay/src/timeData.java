import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class timeData {
    public static void main(String[] args) {
        // Get the current date and time
        LocalDateTime now = LocalDateTime.now();


        // This is to declare date format
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        // This is to declare the time format
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        // Format for the current date and time
        String formattedDate = now.format(dateFormatter);
        String formattedTime = now.format(timeFormatter);

        // This is to display the current date and time
        System.out.println("Today's Date: " + formattedDate);
        System.out.println("Current Time: " + formattedTime);
    }
}
