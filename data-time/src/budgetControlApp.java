import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class budgetControlApp {
    private double budgetLimit;
    private double currentBalance;
    long startTime;
    private long withdrwalTime;


    public budgetControlApp(double budgetLimit) {
        this.budgetLimit = 20000;
        this.currentBalance = 100000;
        this.startTime = System.currentTimeMillis();
        this.withdrwalTime= 0;
    }



        public void withdraw(double amount) {

//            if (withdrwalTime > 0) {
                long timeElapsed = (System.currentTimeMillis() - startTime) / 1000;
                long hours = timeElapsed / 3600;
                long minutes = (timeElapsed % 3600) / 60;
                long seconds = timeElapsed % 60;

                if (timeElapsed < 86400 && withdrwalTime >0 ){// 86400 = 24 hours
                    System.out.println("You have reached your daily withdrawal limit. Please try again after " + (24 - hours) + " hours, " + (60 - minutes) + " minutes, and " + (60 - seconds) + " seconds.");
                    return;
                }
                if (amount > budgetLimit){
                    System.out.println("Withdrawal amount exceeds the budgetLimit");
                return;
                }
                if (amount> currentBalance){
                    System.out.println("Insuffcient funds ");
                return;
                }
                currentBalance -= amount;
                withdrwalTime = System.currentTimeMillis();
                System.out.println(" Withdrawal has been approved. Current Balance:" + " " + currentBalance);

            }

//        }



    public void addDeposit(double amount) {
        currentBalance += amount;
        if (currentBalance > 0 && amount >= 0) {
            System.out.println("money has been deposited!" + " " +  currentBalance);
        } else {
            currentBalance += amount;
            System.out.println(" " + currentBalance);
        }
    }


    public void CheckYourBalance(double amount) {
        System.out.println("Current balance :" + " " + currentBalance);
    }
    }










