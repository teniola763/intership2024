import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        ToDoListTwo OBJ = new ToDoListTwo();
        Scanner scanner = new Scanner(System.in);


        int choice;
        do {
            System.out.println("\n  Tenis's ToDoList menu ");
            System.out.println("\n 1. Add to tasks ");
            System.out.println("\n 2. Delete tasks  ");
            System.out.println("\n 3. View tasks  ");
            System.out.println("\n 4. Exit ");
            System.out.println(" \n   Enter your choice from available options above ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Input Task ID ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("eNTER TASK");
                    String enter = scanner.nextLine();
                    OBJ.addTask(id, enter);
                    break;

                case 2:
                    System.out.println("Input Task ID you want to delete ");
                    int id1 = scanner.nextInt();
                    scanner.nextLine();
                    OBJ.deleteTask(id1);
                    break;

                case 3:
                    OBJ.viewTask();
                    break;

                case 4:
                    System.out.println("Exiting......");
                    break;

                default:
                    System.out.println("Invalid option ! Select the right choice");

            }
        }while (choice != 4) ;
        scanner.close();

        }

    }



