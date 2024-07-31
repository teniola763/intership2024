import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
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
                        TODO_LIST.addTask();
                        break;

                    case 2:
                        TODO_LIST.view();
//                    System.out.println("view");
                        break;

                    case 3:
                        TODO_LIST.edit();
//                    System.out.println("edit");
                        break;

                    case 4:
                        TODO_LIST.delete();
//                    System.out.println("delete");
                        break;

                    case 5:
                        TODO_LIST.exit();
//                      System.out.println("exit");
                        return;
                }
                scanner.close();
            }
        }

    }
