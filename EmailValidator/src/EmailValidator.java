import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class EmailValidator {
    private static final String EMAIL_PATTERN =
            "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" +
                    "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter email addresses (enter 'quit' to stop):");

        while (true) {
            System.out.print("Email address: ");
            String email = scanner.nextLine();

            if (email.equalsIgnoreCase("quit")) {
                break;
            }

            if (isValidEmail(email)) {
                System.out.println("Valid email: " + email);
            } else {
                System.out.println("Invalid email: " + email);
            }
        }
    }

    public static boolean isValidEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}