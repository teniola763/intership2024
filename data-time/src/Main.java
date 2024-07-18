import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String correctPin = "1295";
        int maxAttempts = 4;
        boolean authenticated = false;

        for (int attempts = 1; attempts <= maxAttempts; attempts++) {
            System.out.println("Enter your 4-digit PIN: ");
            String inputPin = scanner.next();

            if (inputPin.equals(correctPin)) {
                authenticated = true;
                break;
            } else {
                int attemptsLeft = maxAttempts - attempts;
                if (attemptsLeft > 0) {
                    System.out.println("Incorrect Pin." + attemptsLeft + "attempts left . Try again.");
                } else {
                    System.out.println("too many incorrect attempts");
                    return;
                }
            }
        }

//        if (!authenticated) {
//            System.out.println("Ahan ahnn ,too many incorrect attempts. Exit pls ");
//            return;
//        }

            System.out.println("Authentication successful. Good for you ");
            System.out.println("welcome.Tap any key and press enter");
            double budgetLimit = scanner.nextDouble();


            budgetControlApp app = new budgetControlApp(budgetLimit);
            while (true) {
                long currentTime = System.currentTimeMillis();
                long timeElapsed = (currentTime - app.startTime) / 1000;
                if (timeElapsed > 24 * 60 * 60) {
                    System.out.println("You have reached your transfer limit, dont be angry ; pls exit the app.");
                    return;

                }


                System.out.println("1: withdraw ");
                System.out.println("2. add deposit");
                System.out.println("3: check your balance ");
                System.out.println("4:  exit ");
                System.out.println("pick an option from the above ");
                int option = scanner.nextInt();

                switch (option) {
                    case 1:
                        System.out.println("Enter amount to be withdrawn");
                        double withdrawmoney = scanner.nextDouble();
                        app.withdraw(withdrawmoney);
                        break;
                    case 2:
                        System.out.println("Enter amount to be deposited");
                        double depositmoney = scanner.nextDouble();
                        app.addDeposit(depositmoney);
                        break;
                    case 3:
//                    double CheckYourBalance = scanner.nextDouble();
                        app.CheckYourBalance(budgetLimit);
                        break;
                    case 4:
                        System.out.println("exitinggg......");
                        return;
                    case 5:
                        System.out.println("invalid option. Key in available options ");
                        break;

                }


            }

        }

    }

