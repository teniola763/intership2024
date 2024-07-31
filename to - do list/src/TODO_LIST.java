import java.util.ArrayList;
import java.util.Scanner;

public class TODO_LIST {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> items = new ArrayList<>();


    public static void addTask() {
        System.out.println("Include task: ");
        String todo = scanner.nextLine();
        items.add(todo);
        System.out.println("task added successfully ");
    }

    public static void view() {
        if (items.isEmpty()) {
            System.out.println("Your todo list is emptyyy");
            }
        else {
            System.out.println("Your todo list is not emptyyy");
            for( int i = 0; i < items.size(); i++) {

                System.out.println((i+1) + " " + items.get(i));
            }
        }
    }

    public static void edit() {
        view();
        if (!items.isEmpty()) {
            System.out.println("Enter number to be edited ");

            int edit = Integer.parseInt(scanner.nextLine());
             if (edit > 0 && edit <= items.size()) {
                System.out.println("Enter your new task ");
                String newitems = scanner.nextLine();
                items.set(edit - 1, newitems);
                System.out.println("items " + edit + " has been edited to :" + newitems);
            } else {
                System.out.println("Invaild number.");
            }
        }
    }

    public static void delete() {
        view();
        if (!items.isEmpty()) {
            System.out.println("Enter number to be removed");

            int delete = Integer.parseInt(scanner.nextLine());
            if (delete > 0 && delete <= items.size()) {
//                System.out.println("Enter your new task ");
                String newitems = scanner.nextLine();
                items.remove(delete - 1);
                System.out.println("items " + delete + " has been removed " + newitems);
            } else {
                System.out.println("Invaild number.");
            }
        }


    }

    public static void exit() {
        System.out.println("exit");

    }
}


