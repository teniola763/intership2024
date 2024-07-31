import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        to_doListHashMap map = new to_doListHashMap();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("teni todo list ");
            System.out.println("Pls select an option ");
            System.out.println("1. adds new task ");
            System.out.println("2. view task");
            System.out.println("3. edit tasks ");
            System.out.println("4. delete a task ");
            System.out.println("5. exit");


            int option = scanner.nextInt();

            switch (option) {
                case 1:
//                System.out.println("Task to add: ");
                    map.addTask();
                    break;

                case 2:
////                System.out.println("view");
                    map.viewTask();
                    break;

                case 3:
                    map.editTask();
//                    System.out.println("edit");
                    break;
//
                case 4:
                    map.delete();
//                    System.out.println("delete");
                    break;

                case 5:
                    map.exit();
//                      System.out.println("exit");
                    return;
   }
            }
        }
    }


